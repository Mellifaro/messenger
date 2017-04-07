package com.softgroup.authorization.impl.handler;

import com.softgroup.authorization.api.dto.ProfileDTO;
import com.softgroup.authorization.api.message.smsconfirm.SmsConfirmRequest;
import com.softgroup.authorization.api.message.smsconfirm.SmsConfirmResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.authorization.impl.util.SmsConfirmUtil;
import com.softgroup.common.dao.api.entities.DeviceEntity;
import com.softgroup.common.dao.api.entities.ProfileEntity;
import com.softgroup.common.dao.impl.service.DeviseService;
import com.softgroup.common.dao.impl.service.ProfileService;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseFactory;
import com.softgroup.common.protocol.ResponseStatus;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.common.token.api.TokenService;
import com.softgroup.common.token.api.TokenType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 03.03.2017.
 */
@Component
public class SmsConfirmHandler extends AbstractRequestHandler<SmsConfirmRequest, SmsConfirmResponse>
                               implements AuthorizationRequestHandler {

    private static final String HANDLER_NAME = "sms_confirm";

    @Autowired
    private SmsConfirmUtil confirmUtil;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private ProfileService profileService;

    @Autowired
    private DeviseService deviceService;

    @Override
    public String getName() {
        return HANDLER_NAME;
    }

    public Response<SmsConfirmResponse> handle(Request<?> msg) {
        Request<SmsConfirmRequest> request = convert(msg);
        ResponseFactory<SmsConfirmResponse> responseFactory = new ResponseFactory<>();

        //receive request data from request
        String registrationRequestUUID = request.getData().getUuid();
        Integer authCode = request.getData().getAuth_code();

        //receive profileDTO from cache
        ProfileDTO profileDTO = confirmUtil.getCache().get(registrationRequestUUID);
        if(!profileDTO.getAuthCode().equals(authCode)){
            Response<SmsConfirmResponse> response = responseFactory.createResponse(msg, null, ResponseStatus.NOT_ACCEPTABLE);
            return response;
        }

        //create profileEntity and deviceEntity
        ProfileEntity profileEntity = new ProfileEntity();
        profileEntity.setPhoneNumber(profileDTO.getPhoneNumber());

        DeviceEntity deviceEntity = new DeviceEntity();
        deviceEntity.setProfile(profileEntity);
        deviceEntity.setConfirmTime(System.currentTimeMillis());

        //save entities to database
        profileService.save(profileEntity);
        deviceService.save(deviceEntity);

        SmsConfirmResponse smsConfirmResponse = new SmsConfirmResponse();
        String token = tokenService.generateToken(profileEntity.getId(), deviceEntity.getId(), TokenType.REGISTER_TOKEN);
        smsConfirmResponse.setDeviceToken(token);
        return responseFactory.createResponse(msg, smsConfirmResponse, ResponseStatus.OK);
    }
}
