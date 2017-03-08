package com.softgroup.generalrouting.impl.router;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.common.router.api.routers.TypeRouterHandler;
import com.softgroup.generalrouting.api.router.GenerealRouterHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 08.03.2017.
 */
@Component
public class GeneralRouterHandlerImpl extends AbstractRouterHandler<TypeRouterHandler>
                                      implements GenerealRouterHandler{

    public static final String NAME = "global_router";

    public String getName() {
        return NAME;
    }

    public String getRouteKey(Request<?> msg) {
        return msg.getHeader().getType();
    }
}
