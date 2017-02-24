package com.sofrtgroup.messenger.api.message.get_convers_by_id;

import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ReceiveConversByIdRequest implements RequestData{
    private static final long serialVersionUID = -2993792178491193280L;

    private List<Integer> conversId;

    public List<Integer> getConversId() {
        return conversId;
    }

    public void setConversId(List<Integer> conversId) {
        this.conversId = conversId;
    }
}
