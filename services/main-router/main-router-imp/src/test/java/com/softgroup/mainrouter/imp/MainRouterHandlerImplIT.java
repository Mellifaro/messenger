package com.softgroup.mainrouter.imp;

/**
 * Created by Виктор on 25.03.2017.
 */
import com.softgroup.common.protocol.ActionHeader;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.RouterHandler;
import com.softgroup.common.router.api.TypeRouterHandler;
import com.softgroup.mainrouter.api.MainRouterHandler;
import com.softgroup.mainrouter.imp.configuration.MainRouterAppCfg;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Виктор on 17.03.2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MainRouterHandlerImplIT.MainRouterTestCfg.class, MainRouterAppCfg.class})
public class MainRouterHandlerImplIT {

    @Autowired
    private MainRouterHandler mainRouter;

    @Autowired
    @Qualifier("authorization")
    private TypeRouterHandler authHandler;

    @Autowired
    @Qualifier("profile")
    private TypeRouterHandler profileHandler;

    @Autowired
    @Qualifier("other_handler")
    private RouterHandler otherHandler;

    @Test
    public void testRoute(){
        Request<?> request = new Request<>();
        ActionHeader actionHeader = new ActionHeader();
        actionHeader.setType("authorization");
        request.setHeader(actionHeader);

        mainRouter.handle(request);

        verify(authHandler).handle(request);
        verify(profileHandler, never()).handle(any(Request.class));
        verify(otherHandler, never()).handle(any(Request.class));
    }

    @Test
    public void testOnlyTypeRoutersExistInGeneralRouter(){
        Request<?> request = new Request<>();
        ActionHeader actionHeader = new ActionHeader();
        actionHeader.setType("other_handler");
        request.setHeader(actionHeader);

        assertThat(mainRouter.handle(request), nullValue());

        verify(otherHandler, never()).handle(request);
    }

    @Configuration
    public static class MainRouterTestCfg{

        @Bean(name = "authorization")
        public TypeRouterHandler handler(){
            TypeRouterHandler handler = mock(TypeRouterHandler.class);
            when(handler.getName()).thenReturn("authorization");
            return handler;
        }

        @Bean(name = "profile")
        public TypeRouterHandler handler2(){
            TypeRouterHandler handler = mock(TypeRouterHandler.class);
            when(handler.getName()).thenReturn("profile");
            return handler;
        }

        @Bean(name = "other_handler")
        public RouterHandler handler3(){
            RouterHandler handler = mock(RouterHandler.class);
            when(handler.getName()).thenReturn("other_handler");
            return handler;
        }
    }
}