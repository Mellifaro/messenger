package com.softgroup.common.router.api;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.factories.HandlerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractRouterHandler<T extends Handler> implements RouterHandler {

	@Override
	public String getRouteKey(Request<?> msg) {
		return null;
	}

	@Override
	public abstract Response<?> handle(Request<?> msg);

}
