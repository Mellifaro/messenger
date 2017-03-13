package com.softgroup.profile.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.profile.api.message.getProfileSettings.ProfileSettingsRequest;
import com.softgroup.profile.api.message.getProfileSettings.ProfileSettingsResponse;
import com.softgroup.profile.api.router.ProfileRequestHandler;

/**
 * Created by Виктор on 13.03.2017.
 */
public class GetProfileSettingsHandler extends AbstractRequestHandler<ProfileSettingsRequest, ProfileSettingsResponse>
                                        implements ProfileRequestHandler {

    private static final String HANDLER_NAME = "get_profile_settings";

    public String getName() {
        return HANDLER_NAME;
    }

    public Response<ProfileSettingsResponse> handle(Request<?> msg) {
        return null;
    }
}
