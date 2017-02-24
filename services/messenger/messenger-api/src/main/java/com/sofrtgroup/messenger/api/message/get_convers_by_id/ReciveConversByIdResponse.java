package com.sofrtgroup.messenger.api.message.get_convers_by_id;

import com.softgroup.common.model.Conversation;
import com.softgroup.common.protocol.ResponseData;

import java.util.List;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ReciveConversByIdResponse implements ResponseData {
    private static final long serialVersionUID = -2339250027584886592L;

    private List<Conversation> conversationList;

    public List<Conversation> getConversationList() {
        return conversationList;
    }

    public void setConversationList(List<Conversation> conversationList) {
        this.conversationList = conversationList;
    }
}
