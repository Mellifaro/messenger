package com.softgroup.messenger.api.message.sendMessage;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.messenger.api.dto.Message;

/**
 * Created by Виктор on 30.03.2017.
 */
public class SendMessageResponse implements ResponseData {
    private static final long serialVersionUID = 5133147644320963500L;

    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
