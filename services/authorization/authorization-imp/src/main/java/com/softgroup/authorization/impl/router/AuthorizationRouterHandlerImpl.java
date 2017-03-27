package com.softgroup.authorization.impl.router;

import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.authorization.api.router.AuthorizationRouterHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.AbstractRouterHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 03.03.2017.
 */
@Component
public class AuthorizationRouterHandlerImpl extends AbstractRouterHandler<AuthorizationRequestHandler>
                                     implements AuthorizationRouterHandler{

    private static final String ROUTER_NAME = "authorization";

    public String getName() {
        return ROUTER_NAME;
    }

    public String getRouteKey(Request<?> msg) {
        return msg.getHeader().getCommand();
    }
}
