package com.softgroup.authorization.impl.handler;

import com.softgroup.authorization.api.message.login.LoginRequest;
import com.softgroup.authorization.api.message.login.LoginResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.common.token.api.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 03.03.2017.
 */
@Component
public class LoginHandler extends AbstractRequestHandler<LoginRequest, LoginResponse>
        implements AuthorizationRequestHandler{

    private static final Long TIMELEFT = 360000L;

    @Autowired
    private TokenService tokenService;

    private static final String HANDLER_NAME = "login";

    @Override
    public String getName() {
        return HANDLER_NAME;
    }

    @Override
    public Response<LoginResponse> handle(Request<?> msg) {
//        Request<LoginRequest> request = convert(msg);
//        String userId = request.getUserId();
//
//        Response<LoginResponse> response = new Response<>();
//        LoginResponse loginResponse = new LoginResponse();
//        loginResponse.setToken(tokenService.generateToken(userId, TIMELEFT, "device_token"));
//        response.setData(loginResponse);
//
//        return response;
        return null;
    }
}