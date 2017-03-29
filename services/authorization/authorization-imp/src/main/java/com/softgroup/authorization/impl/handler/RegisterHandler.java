package com.softgroup.authorization.impl.handler;

import com.softgroup.authorization.api.message.register.RegisterRequest;
import com.softgroup.authorization.api.message.register.RegisterResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.authorization.impl.util.SmsConfirmUtil;
import com.softgroup.common.dao.api.entities.DeviceEntity;
import com.softgroup.common.dao.api.entities.ProfileEntity;
import com.softgroup.common.protocol.ActionHeader;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseStatus;
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

    @Autowired
    private SmsConfirmUtil confirmUtil;

    @Override
    public String getName() {
        return HANDLER_NAME;
    }

    public Response<RegisterResponse> handle(Request<?> msg) {
        Request<RegisterRequest> request = convert(msg);

        //make codes generator
        ProfileEntity profile = new ProfileEntity();

        profile.setId(UUID.randomUUID().toString());
        profile.setCreateDateTime(System.currentTimeMillis());
        profile.setPhoneNumber(request.getData().getPhoneNumber());

        DeviceEntity device = new DeviceEntity();
        device.setId(request.getData().getDeviceId());
        device.setProfile(profile);
//
//        profileService.save(new ProfileEntity());
//        deviceService.save(new DeviceEntity());
//
//        Random randomGenerator = new Random();
//        Integer confirmationCode = randomGenerator.nextInt(100000);
//        confirmUtil.getCache().put(request.getData().getPhoneNumber(), confirmationCode);
//
//
//        Response<RegisterResponse> response = new Response<>();
//        ActionHeader header = new ActionHeader();
//        header.setUuid("200");
//        header.setType("authorization");
//        header.setCommand("register");
//
//        ResponseStatus status = new ResponseStatus();
//        status.setCode(200);
//
//        RegisterResponse data = new RegisterResponse();
//        data.setRegistrTimeoutSec(600);
//        data.setRegRequestUUID(request.getRoutedData().getSessionId());
//        data.setAuthCode(confirmationCode.toString());
//
//        response.setHeader(header);
//        response.setData(data);
//        response.setStatus(status);
//
//        return response;
        return null;
    }
}