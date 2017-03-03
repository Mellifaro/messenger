package com.softgroup.common.router.api.factories;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;

/**
 * Created by Виктор on 03.03.2017.
 */
public interface HandlerFactory<T extends Handler> {
    Handler getHandler(Request<?> msg);
}
