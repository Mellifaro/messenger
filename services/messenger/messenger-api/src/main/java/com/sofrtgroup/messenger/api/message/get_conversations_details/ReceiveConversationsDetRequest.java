package com.sofrtgroup.messenger.api.message.get_conversations_details;

import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ReceiveConversationsDetRequest implements RequestData {
    private static final long serialVersionUID = -6757076267008356597L;

    private List<Integer> listOfConversId;

    public List<Integer> getListOfConversId() {
        return listOfConversId;
    }

    public void setListOfConversId(List<Integer> listOfConversId) {
        this.listOfConversId = listOfConversId;
    }
}
