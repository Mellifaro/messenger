package com.softgroup.authorization.api.router;

import com.softgroup.common.protocol.RequestData;
import com.softgroup.common.protocol.ResponseData;
import com.softgroup.common.router.api.RequestHandler;

public interface AuthorizationRequestHandler<T extends RequestData, R extends ResponseData> extends RequestHandler<T, R> {
}
