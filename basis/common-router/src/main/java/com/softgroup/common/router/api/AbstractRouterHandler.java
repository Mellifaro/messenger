package com.softgroup.common.router.api;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.RequestData;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractRouterHandler<T extends Handler> implements RouterHandler {

	@Autowired
	private List<T> handlers;
	private Map<String, T> handlerMap;

	public AbstractRouterHandler() {
		handlerMap = new HashMap<>();
		for(T handler : handlers){
			handlerMap.put(handler.getName(), handler);
		}
	}

	@Override
	public String getRouteKey(Request msg) {
		return msg.getHeader().getCommand();
	}

	@Override
	public Response handle(Request msg) {
		Handler handler = handlerMap.get(getRouteKey(msg));
		return handler.handle(msg);
	}
}
