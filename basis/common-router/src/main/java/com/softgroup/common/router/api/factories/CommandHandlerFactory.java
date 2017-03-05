package com.softgroup.common.router.api.factories;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Виктор on 03.03.2017.
 */
@Component
public class CommandHandlerFactory<T extends Handler> extends AbstractHandlerFactory<T> {
}
