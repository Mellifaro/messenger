package com.softgroup.profile.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.profile.api.message.get_last_online.LastTimeOnlineRequest;
import com.softgroup.profile.api.message.get_last_online.LastTimeOnlineResponse;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 23.02.2017.
 */
@Component
public class LastTimeOnlineHandler implements ProfileRequestHandler<LastTimeOnlineRequest, LastTimeOnlineResponse> {
    public String getName() {
        return "get_last_time_online";
    }

    public Response<LastTimeOnlineResponse> handle(Request<LastTimeOnlineRequest> msg) {
        return null;
    }
}
