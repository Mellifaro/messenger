package com.softgroup.authorization.api.message.register;

import com.softgroup.common.protocol.RequestData;

/**
 * @author odin
 * @since 20.02.17.
 */
public class RegisterRequest implements RequestData{
	private static final long serialVersionUID = -645554380912935546L;

	private String phoneNumber;
	private String localCode;
	private String deviceId;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLocalCode() {
		return localCode;
	}

	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
}
