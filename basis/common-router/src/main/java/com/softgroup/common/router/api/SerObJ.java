package com.softgroup.common.router.api;

import java.io.Serializable;

/**
 * Created by Виктор on 24.03.2017.
 */
public class SerObJ implements Serializable {

    private static final long serialVersionUID = 4421403538192534746L;
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
