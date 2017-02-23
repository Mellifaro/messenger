package com.softgroup.common.router.api;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.RequestData;
import com.softgroup.common.protocol.ResponseData;

public interface RouterHandler<T extends RequestData, R extends ResponseData> extends Handler<T, R> {

	String getRouteKey(final Request<T> msg);
}
