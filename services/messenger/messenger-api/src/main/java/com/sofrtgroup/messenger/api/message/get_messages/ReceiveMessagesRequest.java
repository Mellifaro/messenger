package com.sofrtgroup.messenger.api.message.get_messages;

import com.softgroup.common.model.Cursor;
import com.softgroup.common.protocol.RequestData;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ReceiveMessagesRequest implements RequestData{
    private static final long serialVersionUID = 5296367498927199366L;

    private Integer conversId;
    private Cursor cursor;

    public Integer getConversId() {
        return conversId;
    }

    public void setConversId(Integer conversId) {
        this.conversId = conversId;
    }

    public Cursor getCursor() {
        return cursor;
    }

    public void setCursor(Cursor cursor) {
        this.cursor = cursor;
    }
}
