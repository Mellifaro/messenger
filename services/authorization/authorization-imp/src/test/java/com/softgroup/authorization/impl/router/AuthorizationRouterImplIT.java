package com.softgroup.authorization.impl.router;

import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.authorization.api.router.AuthorizationRouterHandler;
import com.softgroup.authorization.impl.configuration.AuthorizationAppCfg;
import com.softgroup.common.protocol.ActionHeader;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;
import com.softgroup.common.router.api.configuration.CommonRouterAppCfg;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.Serializable;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

/**
 * Created by Виктор on 04.03.2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CommonRouterAppCfg.class, AuthorizationAppCfg.class})
public class AuthorizationRouterImplIT {

    @Autowired
    private AuthorizationRouterHandler authRouter;

    @Autowired
    @Qualifier("handlerOne")
    private AuthorizationRequestHandler handlerOne;

    @Autowired
    @Qualifier("handlerTwo")
    private AuthorizationRequestHandler handlerTwo;

    @Autowired
    @Qualifier("handlerThree")
    private Handler handlerThree;

    @Test
    public void testRoute(){
        Request<?> request = new Request<Serializable>();
        ActionHeader actionHeader = new ActionHeader();
        actionHeader.setCommand("handler_one");
        request.setHeader(actionHeader);

        authRouter.handle(request);

        verify(handlerOne).handle(request);
        verify(handlerTwo, never()).handle(any(Request.class));
        verify(handlerTwo, never()).handle(any(Request.class));
    }

    @Test
    public void testOnlyAuthHandlersExistInRouter(){
        Request<?> request = new Request<Serializable>();
        ActionHeader actionHeader = new ActionHeader();
        actionHeader.setCommand("handler_three");
        request.setHeader(actionHeader);

        assertThat(authRouter.handle(request), nullValue());

        verify(handlerThree, never()).handle(request);
    }


        @Configuration
        public static class AuthRouterTestCfg{

            @Bean(name = "handlerOne")
            public AuthorizationRequestHandler handler(){
                AuthorizationRequestHandler handler = Mockito.mock(AuthorizationRequestHandler.class);
                when(handler.getName()).thenReturn("handler_one");
                return handler;
            }

            @Bean(name = "handlerTwo")
            public AuthorizationRequestHandler handler2(){
                AuthorizationRequestHandler handler = Mockito.mock(AuthorizationRequestHandler.class);
                when(handler.getName()).thenReturn("handler_two");
                return handler;
            }

            @Bean(name = "handlerThree")
            public Handler handler3(){
                Handler handler = Mockito.mock(Handler.class);
                when(handler.getName()).thenReturn("handler_three");
                return handler;
            }
        }

}
