package com.softgroup.profile.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.profile.api.message.getOtherProfiles.OtherProfilesRequest;
import com.softgroup.profile.api.message.getOtherProfiles.OtherProfilesResponse;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 13.03.2017.
 */
@Component
public class GetOtherProfilesHandler extends AbstractRequestHandler<OtherProfilesRequest, OtherProfilesResponse>
                                     implements ProfileRequestHandler {

    private static final String HANDLER_NAME = "get_other_profiles";

    public String getName() {
        return HANDLER_NAME;
    }

    public Response<OtherProfilesResponse> handle(Request<?> msg) {
        return null;
    }
}
