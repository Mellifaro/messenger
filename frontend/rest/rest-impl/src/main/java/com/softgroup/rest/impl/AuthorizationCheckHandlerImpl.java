package com.softgroup.rest.impl;

import com.softgroup.common.protocol.*;
import com.softgroup.mainrouter.api.MainRouterHandler;
import com.softgroup.rest.api.AuthorizationCheckHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Виктор on 07.04.2017.
 */
@Component
public class AuthorizationCheckHandlerImpl implements AuthorizationCheckHandler{

    private static final String NAME = "authorization_check_handler";
    private static final Set<String> validCommands = new HashSet<>(
            Arrays.asList("register", "login", "sms_confirm"));
    private static final String TYPE = "authorization";

    @Autowired
    private MainRouterHandler mainRouter;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public Response<?> handle(Request<?> msg) {
        ActionHeader header = msg.getHeader();
        String type = header.getType();
        String command = header.getCommand();

        if(type.equals(TYPE) && validCommands.contains(command)){
            return mainRouter.handle(msg);
        }
        ResponseFactory<?> responseFactory = new ResponseFactory<>();
        return responseFactory.createResponse(msg, ResponseStatus.FORBIDDEN);
    }
}
