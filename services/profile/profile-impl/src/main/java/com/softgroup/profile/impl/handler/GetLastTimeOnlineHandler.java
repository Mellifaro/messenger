package com.softgroup.profile.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.profile.api.message.getLastTimeOnline.GetLastTimeOnlineRequest;
import com.softgroup.profile.api.message.getLastTimeOnline.GetLastTimeOnlineResponse;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 13.03.2017.
 */
@Component
public class GetLastTimeOnlineHandler extends AbstractRequestHandler<GetLastTimeOnlineRequest, GetLastTimeOnlineResponse>
                                      implements ProfileRequestHandler {

    private static final String HANDLER_NAME = "get_contact_profiles";

    public String getName() {
        return HANDLER_NAME;
    }

    public Response<GetLastTimeOnlineResponse> handle(Request<?> msg) {
        return null;
    }
}
