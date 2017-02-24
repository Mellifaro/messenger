package com.sofrtgroup.messenger.api.message.get_messages;

import com.softgroup.common.model.Cursor;
import com.softgroup.common.model.Message;
import com.softgroup.common.protocol.ResponseData;

import java.util.List;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ReceiveMessagesResponse implements ResponseData{
    private static final long serialVersionUID = 4548441624898422293L;

    private List<Message> messages;
    private Integer totalUnread;
    private Cursor cursor;

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Integer getTotalUnread() {
        return totalUnread;
    }

    public void setTotalUnread(Integer totalUnread) {
        this.totalUnread = totalUnread;
    }

    public Cursor getCursor() {
        return cursor;
    }

    public void setCursor(Cursor cursor) {
        this.cursor = cursor;
    }
}
