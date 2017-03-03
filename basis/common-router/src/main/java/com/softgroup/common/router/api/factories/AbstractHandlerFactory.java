package com.softgroup.common.router.api.factories;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Виктор on 03.03.2017.
 */
public abstract class AbstractHandlerFactory<T extends Handler> {
    protected Map<String, T> handlerMap;

    @Autowired
    private List<T> handlerList;

    @PostConstruct
    public void init(){
        handlerMap = handlerList.stream()
                .collect(Collectors.toMap(Handler::getName, Function.identity()));
    }

    public abstract Handler getHandler(Request<?> msg);
}
