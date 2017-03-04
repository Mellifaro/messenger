package com.softgroup.authorization.impl.handler;

import com.softgroup.authorization.api.message.login.LoginRequest;
import com.softgroup.authorization.api.message.login.LoginResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 03.03.2017.
 */
@Component
public class LoginHandler extends AbstractRequestHandler<LoginRequest, LoginResponse>
                          implements AuthorizationRequestHandler{

    private static final String HANDLER_NAME = "login";

    @Override
    public String getName() {
        return HANDLER_NAME;
    }

    @Override
    public Response<LoginResponse> handle(Request<?> msg) {
        return null;
    }
}
