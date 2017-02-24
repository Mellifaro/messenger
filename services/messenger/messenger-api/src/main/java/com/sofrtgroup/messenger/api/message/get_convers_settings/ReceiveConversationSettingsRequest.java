package com.sofrtgroup.messenger.api.message.get_convers_settings;

import com.softgroup.common.protocol.RequestData;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ReceiveConversationSettingsRequest implements RequestData{
    private static final long serialVersionUID = 6824271810292607706L;

    private Integer conversId;

    public Integer getConversId() {
        return conversId;
    }

    public void setConversId(Integer conversId) {
        this.conversId = conversId;
    }
}
