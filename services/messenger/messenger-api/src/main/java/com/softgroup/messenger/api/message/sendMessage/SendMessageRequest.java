package com.softgroup.messenger.api.message.sendMessage;

import com.softgroup.common.protocol.RequestData;
import com.softgroup.messenger.api.dto.MessageRequestDTO;

/**
 * Created by Виктор on 30.03.2017.
 */
public class SendMessageRequest implements RequestData {
    private static final long serialVersionUID = -7477264064122588368L;

    private MessageRequestDTO messageDTO;

    public MessageRequestDTO getMessageDTO() {
        return messageDTO;
    }

    public void setMessageDTO(MessageRequestDTO messageDTO) {
        this.messageDTO = messageDTO;
    }
}
