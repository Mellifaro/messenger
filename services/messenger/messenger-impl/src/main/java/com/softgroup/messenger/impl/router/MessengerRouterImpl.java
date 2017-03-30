package com.softgroup.messenger.impl.router;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.messenger.api.router.MessengerRequestHandler;
import com.softgroup.messenger.api.router.MessengerRouterHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 30.03.2017.
 */
@Component
public class MessengerRouterImpl extends AbstractRouterHandler<MessengerRequestHandler>
                                 implements MessengerRouterHandler {

    private static final String ROUTER_NAME = "messenger";

    public String getRouteKey(Request<?> msg) {
        return msg.getHeader().getCommand();
    }

    public String getName() {
        return ROUTER_NAME;
    }
}
