package com.softgroup.profile.api.router;

import com.softgroup.common.protocol.RequestData;
import com.softgroup.common.protocol.ResponseData;
import com.softgroup.common.router.api.RequestHandler;

/**
 * Created by Виктор on 23.02.2017.
 */
public interface ProfileRequestHandler<T extends RequestData, R extends ResponseData> extends RequestHandler<T, R> {
}
