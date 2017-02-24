package com.sofrtgroup.messenger.api.message.confirm_read_message;

import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ConfirmReadMessageRequest implements RequestData{
    private static final long serialVersionUID = 7860554984083071880L;

    private Integer conversId;
    private List<Integer> messageIds;

    public Integer getConversId() {
        return conversId;
    }

    public void setConversId(Integer conversId) {
        this.conversId = conversId;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
    }

    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
    }
}
