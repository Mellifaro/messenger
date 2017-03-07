package com.softgroup.common.router.api;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.factories.HandlerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class AbstractRouterHandler<T extends Handler> implements RouterHandler {

	@Autowired
	private HandlerFactory<T> handlerFactory;

	@Override
	public abstract String getRouteKey(Request<?> msg);

	@Override
	public Response<?> handle(Request<?> msg){
		Handler handler = handlerFactory.getHandler(getRouteKey(msg));
		return handler == null ? null : handler.handle(msg);
	}
}
