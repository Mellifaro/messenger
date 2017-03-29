package com.softgroup.common.router.api;

import java.io.Serializable;

/**
 * Created by Виктор on 27.03.2017.
 */
public class CommonData implements Serializable{
    private static final long serialVersionUID = 4973417185759243479L;

    private String jsonData;

    public CommonData() {
    }

    public CommonData(String jsonData) {
        this.jsonData = jsonData;
    }

    public String getJsonData() {
        return jsonData;
    }

    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }
}
