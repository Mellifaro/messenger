package com.softgroup.messenger.impl.handler;

import com.sofrtgroup.messenger.api.message.is_typing_in_chat.IsTypingRequest;
import com.sofrtgroup.messenger.api.message.is_typing_in_chat.IsTypingResponse;
import com.sofrtgroup.messenger.api.router.MessengerRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;

/**
 * Created by Виктор on 24.02.2017.
 */
public class IsTypingHandler implements MessengerRequestHandler<IsTypingRequest, IsTypingResponse>{
    public String getName() {
        return "is_typing_in_chat";
    }

    public Response<IsTypingResponse> handle(Request<IsTypingRequest> msg) {
        return null;
    }
}
