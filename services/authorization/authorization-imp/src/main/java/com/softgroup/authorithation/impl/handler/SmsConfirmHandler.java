package com.softgroup.authorithation.impl.handler;

import com.softgroup.authorization.api.message.smsconfirm.SmcConfirmResponse;
import com.softgroup.authorization.api.message.smsconfirm.SmsConfirmRequest;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 23.02.2017.
 */
@Component
public class SmsConfirmHandler implements AuthorizationRequestHandler<SmsConfirmRequest, SmcConfirmResponse>{

    public String getName() {
        return "sms_confirm";
    }

    public Response<SmcConfirmResponse> handle(Request<SmsConfirmRequest> msg) {
        return null;
    }
}
