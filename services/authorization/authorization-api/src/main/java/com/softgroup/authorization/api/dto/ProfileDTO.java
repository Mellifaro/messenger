package com.softgroup.authorization.api.dto;

import java.io.Serializable;

/**
 * Created by Виктор on 07.04.2017.
 */
public class ProfileDTO implements Serializable{
    private static final long serialVersionUID = 762627810762984240L;

    private String phoneNumber;

    private String localeCode;

    private String deviceId;

    private Integer authCode;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLocaleCode() {
        return localeCode;
    }

    public void setLocaleCode(String localeCode) {
        this.localeCode = localeCode;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getAuthCode() {
        return authCode;
    }

    public void setAuthCode(Integer authCode) {
        this.authCode = authCode;
    }
}
