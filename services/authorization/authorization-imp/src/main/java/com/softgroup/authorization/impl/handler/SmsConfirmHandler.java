package com.softgroup.authorization.impl.handler;

import com.softgroup.authorization.api.message.smsconfirm.SmsConfirmRequest;
import com.softgroup.authorization.api.message.smsconfirm.SmsConfirmResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.router.api.AbstractRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 03.03.2017.
 */
@Component
public class SmsConfirmHandler extends AbstractRequestHandler<SmsConfirmRequest, SmsConfirmResponse>
                               implements AuthorizationRequestHandler {
    @Override
    public String getName() {
        return "sms_confirm";
    }
}
