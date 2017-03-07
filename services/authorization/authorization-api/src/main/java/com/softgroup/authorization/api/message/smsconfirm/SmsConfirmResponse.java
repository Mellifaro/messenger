package com.softgroup.authorization.api.message.smsconfirm;

import com.softgroup.common.protocol.ResponseData;

/**
 * Created by Виктор on 03.03.2017.
 */
public class SmsConfirmResponse implements ResponseData{
    private static final long serialVersionUID = -7597908346241330378L;

    private String deviceToken;

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }
}
