package com.softgroup.common.protocol;

public enum ResponseStatus{
    OK(200),
    BAD_REQUEST(400),
    FORBIDDEN(403),
    NOT_FOUND(404),
    NOT_ACCEPTABLE(406),
    UNPROCESSABLE_ENTITY(422),
    TOO_MANY_REQUESTS(429),
    INTERNAL_SERVER_ERROR(500),
    NOT_IMPLEMENTED(501);

    private final Integer code;

    private ResponseStatus(Integer code) {
        this.code = code;
    }

    public boolean equelsCode(Integer otherCode){
        return code.equals(otherCode);
    }

    public Integer getCode() {
        return code;
    }
}
