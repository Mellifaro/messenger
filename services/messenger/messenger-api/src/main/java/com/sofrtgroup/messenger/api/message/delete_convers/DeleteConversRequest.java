package com.sofrtgroup.messenger.api.message.delete_convers;

import com.softgroup.common.protocol.RequestData;

/**
 * Created by Виктор on 24.02.2017.
 */
public class DeleteConversRequest implements RequestData{
    private static final long serialVersionUID = 2289204962611321452L;

    private Integer conversId;

    public Integer getConversId() {
        return conversId;
    }

    public void setConversId(Integer conversId) {
        this.conversId = conversId;
    }
}
