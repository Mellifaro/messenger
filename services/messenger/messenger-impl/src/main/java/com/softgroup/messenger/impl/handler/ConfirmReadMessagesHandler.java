package com.softgroup.messenger.impl.handler;

import com.sofrtgroup.messenger.api.message.confirm_read_message.ConfirmReadMessageRequest;
import com.sofrtgroup.messenger.api.message.confirm_read_message.ConfirmReadMessageResponse;
import com.sofrtgroup.messenger.api.router.MessengerRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;

/**
 * Created by Виктор on 24.02.2017.
 */
public class ConfirmReadMessagesHandler implements MessengerRequestHandler<ConfirmReadMessageRequest, ConfirmReadMessageResponse> {
    public String getName() {
        return "messages_read_confirmation";
    }

    public Response<ConfirmReadMessageResponse> handle(Request<ConfirmReadMessageRequest> msg) {
        return null;
    }
}
