package com.softgroup.profile.impl.router;

import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import com.softgroup.profile.api.router.ProfileRouterHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 23.02.2017.
 */
@Component
public class ProfileRouterHandlerImpl extends AbstractRouterHandler<ProfileRequestHandler> implements ProfileRouterHandler{
    public String getName() {
        return "profile";
    }
}
