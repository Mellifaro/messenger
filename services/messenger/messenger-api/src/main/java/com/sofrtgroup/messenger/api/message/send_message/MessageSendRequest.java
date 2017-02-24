package com.sofrtgroup.messenger.api.message.send_message;

import com.softgroup.common.model.MessageRequestDTO;
import com.softgroup.common.protocol.RequestData;

/**
 * Created by Виктор on 24.02.2017.
 */
public class MessageSendRequest implements RequestData{
    private static final long serialVersionUID = 5105966923119885835L;

    private MessageRequestDTO messageDTO;

    public MessageRequestDTO getMessageDTO() {
        return messageDTO;
    }

    public void setMessageDTO(MessageRequestDTO messageDTO) {
        this.messageDTO = messageDTO;
    }
}
