package com.softgroup.authorization.impl.handler;

import com.softgroup.authorization.api.message.smsconfirm.SmsConfirmRequest;
import com.softgroup.authorization.api.message.smsconfirm.SmsConfirmResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 03.03.2017.
 */
@Component
public class SmsConfirmHandler extends AbstractRequestHandler<SmsConfirmRequest, SmsConfirmResponse>
                               implements AuthorizationRequestHandler {

    private static final String HANDLER_NAME = "sms_confirm";

    @Override
    public String getName() {
        return HANDLER_NAME;
    }

    public Response<SmsConfirmResponse> handle(Request<?> msg) {
        return null;
    }
}
