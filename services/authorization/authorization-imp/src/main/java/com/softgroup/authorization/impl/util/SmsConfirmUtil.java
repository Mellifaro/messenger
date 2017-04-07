package com.softgroup.authorization.impl.util;

/**
 * Created by Виктор on 28.03.2017.
 */
import com.softgroup.authorization.api.dto.ProfileDTO;
import net.jodah.expiringmap.ExpiringMap;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by Виктор on 27.03.2017.
 */
@Component
public class SmsConfirmUtil {

    private Map<String, ProfileDTO> cache;

    public SmsConfirmUtil() {
        cache = ExpiringMap.builder()
                .expiration(2, TimeUnit.MINUTES)
                .build();
    }

    public Map<String, ProfileDTO> getCache() {
        return cache;
    }

    public void setCache(Map<String, ProfileDTO> cache) {
        this.cache = cache;
    }
}