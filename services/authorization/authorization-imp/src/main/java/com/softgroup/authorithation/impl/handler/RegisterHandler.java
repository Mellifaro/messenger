package com.softgroup.authorithation.impl.handler;

import com.softgroup.authorization.api.message.RegisterRequest;
import com.softgroup.authorization.api.message.RegisterResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;

/**
 * Created by Виктор on 23.02.2017.
 */
public class RegisterHandler implements AuthorizationRequestHandler<RegisterRequest, RegisterResponse>{

    public String getName() {
        return "register";
    }

    public Response<RegisterResponse> handle(Request<RegisterRequest> msg) {
        return null;
    }
}
