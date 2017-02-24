package com.softgroup.authorithation.impl.router;

import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.router.api.AbstractRouterHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 23.02.2017.
 */
@Component
public class AuthorizationRouterHandlerImpl extends AbstractRouterHandler<AuthorizationRequestHandler>{

    public String getName() {
        return "authorization";
    }
}
