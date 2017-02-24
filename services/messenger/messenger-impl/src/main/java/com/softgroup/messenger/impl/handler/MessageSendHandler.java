package com.softgroup.messenger.impl.handler;

import com.sofrtgroup.messenger.api.message.send_message.MessageSendRequest;
import com.sofrtgroup.messenger.api.message.send_message.MessageSendResponse;
import com.sofrtgroup.messenger.api.router.MessengerRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;

/**
 * Created by Виктор on 24.02.2017.
 */
public class MessageSendHandler implements MessengerRequestHandler<MessageSendRequest, MessageSendResponse> {
    public String getName() {
        return "send_message";
    }

    public Response<MessageSendResponse> handle(Request<MessageSendRequest> msg) {
        return null;
    }
}
