package com.softgroup.messenger.impl.router;

import com.sofrtgroup.messenger.api.router.MessengerRequestHandler;
import com.sofrtgroup.messenger.api.router.MessengerRouterHandler;
import com.softgroup.common.router.api.AbstractRouterHandler;

/**
 * Created by Виктор on 24.02.2017.
 */
public class MessengerRouterHandlerImpl extends AbstractRouterHandler<MessengerRequestHandler> implements MessengerRouterHandler{
    public String getName() {
        return "messenger";
    }
}
