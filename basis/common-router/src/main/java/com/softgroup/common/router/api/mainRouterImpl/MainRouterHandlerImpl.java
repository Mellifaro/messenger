package com.softgroup.common.router.api.mainRouterImpl;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.common.router.api.routers.MainRouterHandler;
import com.softgroup.common.router.api.routers.TypeRouterHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 13.03.2017.
 */
@Component
public class MainRouterHandlerImpl extends AbstractRouterHandler<TypeRouterHandler>
                                   implements MainRouterHandler {

    public static final String NAME = "global_router";

    public String getName() {
        return NAME;
    }

    public String getRouteKey(Request<?> msg) {
        return msg.getHeader().getType();
    }
}
