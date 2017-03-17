package com.softgroup.profile.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.profile.api.message.getOtherProfiles.GetOtherProfilesRequest;
import com.softgroup.profile.api.message.getOtherProfiles.GetOtherProfilesResponse;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 13.03.2017.
 */
@Component
public class GetOtherProfilesHandler extends AbstractRequestHandler<GetOtherProfilesRequest, GetOtherProfilesResponse>
                                     implements ProfileRequestHandler {

    private static final String HANDLER_NAME = "get_other_profiles";

    public String getName() {
        return HANDLER_NAME;
    }

    public Response<GetOtherProfilesResponse> handle(Request<?> msg) {
        return null;
    }
}
