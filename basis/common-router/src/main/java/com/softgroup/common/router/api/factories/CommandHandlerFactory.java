package com.softgroup.common.router.api.factories;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 03.03.2017.
 */
@Component
public class CommandHandlerFactory<T extends Handler> extends AbstractHandlerFactory<T> {

    @Override
    public Handler getHandler(Request<?> msg) {
        return super.handlerMap.get(msg.getHeader().getCommand());
    }
}
