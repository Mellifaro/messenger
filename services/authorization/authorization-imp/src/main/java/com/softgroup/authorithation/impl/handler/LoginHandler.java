package com.softgroup.authorithation.impl.handler;

import com.softgroup.authorization.api.message.LoginRequest;
import com.softgroup.authorization.api.message.LoginResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.RequestData;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseData;

/**
 * Created by Виктор on 23.02.2017.
 */
public class LoginHandler implements AuthorizationRequestHandler<LoginRequest, LoginResponse> {

    public String getName() {
        return "login";
    }

    public Response<LoginResponse> handle(Request<LoginRequest> msg) {
        return null;
    }
}
