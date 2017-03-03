package com.softgroup.authorization.impl.router;

import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.authorization.api.router.AuthorizationRouterHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.common.router.api.Handler;
import com.softgroup.common.router.api.factories.CommandHandlerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 03.03.2017.
 */
@Component
public class AuthorizationRouterImpl extends AbstractRouterHandler<AuthorizationRequestHandler>
                                     implements AuthorizationRouterHandler{

    @Autowired
    private CommandHandlerFactory<AuthorizationRequestHandler> handlerFactory;

    public String getName() {
        return "authorization";
    }

    @Override
    public Response<?> handle(Request<?> msg) {
        Handler handler = handlerFactory.getHandler(msg);
        return handler.handle(msg);
    }
}
