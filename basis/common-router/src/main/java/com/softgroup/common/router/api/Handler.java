package com.softgroup.common.router.api;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.RequestData;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseData;

public interface Handler<T extends RequestData, R extends ResponseData> {
    String getName();

    Response<R> handle(final Request<T> msg);
}
