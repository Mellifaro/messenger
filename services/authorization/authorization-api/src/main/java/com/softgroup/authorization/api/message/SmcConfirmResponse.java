package com.softgroup.authorization.api.message;

import com.softgroup.common.protocol.ResponseData;

/**
 * Created by Виктор on 23.02.2017.
 */
public class SmcConfirmResponse implements ResponseData{
    private static final long serialVersionUID = -7597908346241330378L;

    private String deviceToken;

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }
}
