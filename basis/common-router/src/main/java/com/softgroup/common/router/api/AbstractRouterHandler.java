package com.softgroup.common.router.api;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.RequestData;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseData;

public abstract class AbstractRouterHandler<T extends Handler, K extends RequestData, R extends ResponseData> implements RouterHandler<K, R> {

	@Override
	public String getRouteKey(Request<K> msg) {
		return null;
	}

	@Override
	public Response<R> handle(Request<K> msg) {
		return null;
	}
}
