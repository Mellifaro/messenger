package com.softgroup.authorithation.impl.handler;

import com.softgroup.authorization.api.message.login.LoginRequest;
import com.softgroup.authorization.api.message.login.LoginResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 23.02.2017.
 */
@Component
public class LoginHandler implements AuthorizationRequestHandler<LoginRequest, LoginResponse> {

    public String getName() {
        return "login";
    }

    public Response<LoginResponse> handle(Request<LoginRequest> msg) {
        return null;
    }
}
