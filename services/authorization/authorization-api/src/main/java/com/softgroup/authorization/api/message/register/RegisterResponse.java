package com.softgroup.authorization.api.message.register;

import com.softgroup.common.protocol.ResponseData;

/**
 * @author odin
 * @since 20.02.17.
 */
public class RegisterResponse implements ResponseData {
	private static final long serialVersionUID = -5146888202653750948L;

	private String regRequestUUID;
	private Integer registerTimeoutSec;
	private Integer authCode;

	public String getRegRequestUUID() {
		return regRequestUUID;
	}

	public void setRegRequestUUID(String regRequestUUID) {
		this.regRequestUUID = regRequestUUID;
	}

	public Integer getRegistrTimeoutSec() {
		return registerTimeoutSec;
	}

	public void setRegistrTimeoutSec(Integer registrTimeoutSec) {
		this.registerTimeoutSec = registrTimeoutSec;
	}

	public Integer getAuthCode() {
		return authCode;
	}

	public void setAuthCode(Integer authCode) {
		this.authCode = authCode;
	}
}
