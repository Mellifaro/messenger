package com.softgroup.messenger.api.message.getMessages;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.messenger.api.dto.Cursor;
import com.softgroup.messenger.api.dto.Message;

import java.util.List;

/**
 * Created by Виктор on 30.03.2017.
 */
public class GetMessagesResponse implements ResponseData {
    private static final long serialVersionUID = 4964604441206161027L;

    private List<Message> messageList;
    private Integer totalUnread;
    private Cursor cursor;

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
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
