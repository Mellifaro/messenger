package com.softgroup.authorization.impl.util;

/**
 * Created by Виктор on 28.03.2017.
 */
import net.jodah.expiringmap.ExpiringMap;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by Виктор on 27.03.2017.
 */
@Component
public class SmsConfirmUtil {

    private Map<String, Integer> cache;

    public SmsConfirmUtil() {
        cache = ExpiringMap.builder()
                .expiration(10, TimeUnit.MINUTES)
                .build();
    }

    public Map<String, Integer> getCache() {
        return cache;
    }

    public void setCache(Map<String, Integer> cache) {
        this.cache = cache;
    }
}