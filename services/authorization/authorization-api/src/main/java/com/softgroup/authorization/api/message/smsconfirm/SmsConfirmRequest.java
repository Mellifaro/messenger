package com.softgroup.authorization.api.message.smsconfirm;

import com.softgroup.common.protocol.RequestData;

/**
 * Created by Виктор on 23.02.2017.
 */
public class SmsConfirmRequest implements RequestData{
    private static final long serialVersionUID = 16282141842368961L;

    private Integer auth_code;
    private String uuid;

    public Integer getAuth_code() {
        return auth_code;
    }

    public void setAuth_code(Integer auth_code) {
        this.auth_code = auth_code;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
