package com.sofrtgroup.messenger.api.router;

import com.softgroup.common.protocol.RequestData;
import com.softgroup.common.protocol.ResponseData;
import com.softgroup.common.router.api.RequestHandler;

/**
 * Created by Виктор on 24.02.2017.
 */
public interface MessengerRequestHandler<T extends RequestData, R extends ResponseData> extends RequestHandler<T, R>{
}
