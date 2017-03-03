package com.softgroup.authorization.impl.handler;

import com.softgroup.authorization.api.message.register.RegisterRequest;
import com.softgroup.authorization.api.message.register.RegisterResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 03.03.2017.
 */
@Component
public class RegisterHandler extends AbstractRequestHandler<RegisterRequest, RegisterResponse>
                             implements AuthorizationRequestHandler {
    @Override
    public String getName() {
        return "register";
    }

    public Response<RegisterResponse> handle(Request<?> msg) {
        return null;
    }
}
