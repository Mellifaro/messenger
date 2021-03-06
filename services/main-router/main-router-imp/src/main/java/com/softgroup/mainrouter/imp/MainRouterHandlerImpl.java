package com.softgroup.mainrouter.imp;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.common.router.api.TypeRouterHandler;
import com.softgroup.mainrouter.api.MainRouterHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 17.03.2017.
 */
@Component
public class MainRouterHandlerImpl extends AbstractRouterHandler<TypeRouterHandler>
        implements MainRouterHandler {

    public static final String NAME = "main_router";

    public String getName() {
        return NAME;
    }

    public String getRouteKey(Request<?> msg) {
        return msg.getHeader().getType();
    }
}