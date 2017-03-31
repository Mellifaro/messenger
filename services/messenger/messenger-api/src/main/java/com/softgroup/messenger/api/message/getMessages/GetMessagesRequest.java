package com.softgroup.messenger.api.message.getMessages;

import com.softgroup.common.protocol.RequestData;
import com.softgroup.messenger.api.dto.Cursor;

/**
 * Created by Виктор on 30.03.2017.
 */
public class GetMessagesRequest implements RequestData {
    private static final long serialVersionUID = 6219534318871507358L;

    private String conversationId;
    private Cursor cursor;

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public Cursor getCursor() {
        return cursor;
    }

    public void setCursor(Cursor cursor) {
        this.cursor = cursor;
    }
}
