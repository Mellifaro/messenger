package com.softgroup.profile.impl.router;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import com.softgroup.profile.api.router.ProfileRouterHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 13.03.2017.
 */
@Component
public class ProfileRouterImpl extends AbstractRouterHandler<ProfileRequestHandler>
                               implements ProfileRouterHandler {

    private static final String ROUTER_NAME = "profile";

    public String getRouteKey(Request<?> msg) {
        return msg.getHeader().getCommand();
    }

    public String getName() {
        return ROUTER_NAME;
    }
}
