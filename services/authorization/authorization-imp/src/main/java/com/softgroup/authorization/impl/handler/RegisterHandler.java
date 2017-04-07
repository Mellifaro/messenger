package com.softgroup.authorization.impl.handler;

import com.softgroup.authorization.api.dto.ProfileDTO;
import com.softgroup.authorization.api.message.register.RegisterRequest;
import com.softgroup.authorization.api.message.register.RegisterResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.authorization.impl.util.SmsConfirmUtil;
import com.softgroup.common.dao.api.entities.DeviceEntity;
import com.softgroup.common.dao.api.entities.ProfileEntity;
import com.softgroup.common.protocol.*;
import com.softgroup.common.router.api.AbstractRequestHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.UUID;

/**
 * Created by Виктор on 03.03.2017.
 */
@Component
public class RegisterHandler extends AbstractRequestHandler<RegisterRequest, RegisterResponse>
        implements AuthorizationRequestHandler {

    private static final String HANDLER_NAME = "register";
    private static final Integer REGISTRATION_TIMEOUT_SEC = 60;

    @Autowired
    private SmsConfirmUtil confirmUtil;

    @Override
    public String getName() {
        return HANDLER_NAME;
    }

    public Response<RegisterResponse> handle(Request<?> msg) {
        Request<RegisterRequest> request = convert(msg);

        //put data from request to profileDTO
        Integer authCode = new Random().nextInt(100000);
        ProfileDTO profileDTO = new ProfileDTO();
        profileDTO.setPhoneNumber(request.getData().getPhoneNumber());
        profileDTO.setLocaleCode(request.getData().getLocalCode());
        profileDTO.setDeviceId(request.getData().getDeviceId());
        profileDTO.setAuthCode(authCode);

        //put sessionUUID and profileDTO to expiredMap
        String registrationRequestUUID = UUID.randomUUID().toString();
        confirmUtil.getCache().put(registrationRequestUUID, profileDTO);

        //create RegisterResponse
        RegisterResponse data = new RegisterResponse();
        data.setRegRequestUUID(registrationRequestUUID);
        data.setAuthCode(authCode);
        data.setRegistrTimeoutSec(REGISTRATION_TIMEOUT_SEC);

        ResponseFactory<RegisterResponse> responseFactory = new ResponseFactory<>();
        Response<RegisterResponse> response = responseFactory.createResponse(msg, data, ResponseStatus.OK);
        return response;
    }
}