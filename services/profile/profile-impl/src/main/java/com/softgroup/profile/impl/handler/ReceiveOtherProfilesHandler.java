package com.softgroup.profile.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.profile.api.message.get_other_profiles.OtherProfilesRequest;
import com.softgroup.profile.api.message.get_other_profiles.OtherProfilesResponse;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 23.02.2017.
 */
@Component
public class ReceiveOtherProfilesHandler implements ProfileRequestHandler<OtherProfilesRequest, OtherProfilesResponse>{
    public String getName() {
        return "get_other_profiles";
    }

    public Response<OtherProfilesResponse> handle(Request<OtherProfilesRequest> msg) {
        return null;
    }
}
