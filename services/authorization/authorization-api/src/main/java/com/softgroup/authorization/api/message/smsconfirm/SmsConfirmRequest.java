package com.softgroup.authorization.api.message.smsconfirm;

import com.softgroup.common.protocol.RequestData;

/**
 * Created by Виктор on 03.03.2017.
 */
public class SmsConfirmRequest implements RequestData {
    private static final long serialVersionUID = 16282141842368961L;

    private Integer authCode;
    private String uuid;

    public Integer getAuth_code() {
        return authCode;
    }

    public void setAuth_code(Integer authCode) {
        this.authCode = authCode;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}