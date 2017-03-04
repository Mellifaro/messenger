package com.softgroup.authorization.impl.router;

import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.authorization.api.router.AuthorizationRouterHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.common.router.api.Handler;
import com.softgroup.common.router.api.factories.HandlerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 03.03.2017.
 */
@Component
public class AuthorizationRouterImpl extends AbstractRouterHandler<AuthorizationRequestHandler>
                                     implements AuthorizationRouterHandler{

    private static final String ROUTER_NAME = "authorization";

    @Autowired
    @Qualifier("commandHandlerFactory")
    private HandlerFactory<AuthorizationRequestHandler> commandHandlerFactory;

    public String getName() {
        return ROUTER_NAME;
    }

    public String getRouteKey(Request<?> msg) {
        return msg.getHeader().getCommand();
    }

    public Response<?> handle(Request<?> msg) {
        String routeKey = getRouteKey(msg);
        Handler handler = commandHandlerFactory.getHandler(routeKey);
        return handler.handle(msg);
    }
}
