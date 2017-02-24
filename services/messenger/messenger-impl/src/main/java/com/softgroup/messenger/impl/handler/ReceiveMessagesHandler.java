package com.softgroup.messenger.impl.handler;


import com.sofrtgroup.messenger.api.message.get_messages.ReceiveMessagesRequest;
import com.sofrtgroup.messenger.api.message.get_messages.ReceiveMessagesResponse;
import com.sofrtgroup.messenger.api.router.MessengerRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ReceiveMessagesHandler implements MessengerRequestHandler<ReceiveMessagesRequest, ReceiveMessagesResponse> {
    public String getName() {
        return "get_messages";
    }

    public Response<ReceiveMessagesResponse> handle(Request<ReceiveMessagesRequest> msg) {
        return null;
    }
}
