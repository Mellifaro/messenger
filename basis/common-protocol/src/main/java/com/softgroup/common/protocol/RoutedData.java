package com.softgroup.common.protocol;

import java.io.Serializable;

/**
 * Created by Виктор on 27.03.2017.
 */
public class RoutedData implements Serializable{
    private static final long serialVersionUID = 3930278156237773465L;

    private String userId;
    private String deviceId;
    private String sessionUUID;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getSessionUUID() {
        return sessionUUID;
    }

    public void setSessionUUID(String sessionUUID) {
        this.sessionUUID = sessionUUID;
    }
}
