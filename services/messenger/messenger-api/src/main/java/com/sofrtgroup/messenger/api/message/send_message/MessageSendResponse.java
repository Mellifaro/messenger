package com.sofrtgroup.messenger.api.message.send_message;

import com.softgroup.common.model.Message;
import com.softgroup.common.protocol.ResponseData;

/**
 * Created by Виктор on 24.02.2017.
 */
public class MessageSendResponse implements ResponseData {
    private static final long serialVersionUID = -6955917408494123096L;

    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
