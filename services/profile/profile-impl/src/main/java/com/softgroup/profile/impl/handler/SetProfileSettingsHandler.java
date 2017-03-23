package com.softgroup.profile.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.profile.api.message.setProfileSettings.SetProfileSettingsRequest;
import com.softgroup.profile.api.message.setProfileSettings.SetProfileSettingsResponse;
import com.softgroup.profile.api.router.ProfileRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Виктор on 13.03.2017.
 */
@Component
public class SetProfileSettingsHandler extends AbstractRequestHandler<SetProfileSettingsRequest, SetProfileSettingsResponse>
                                       implements ProfileRequestHandler {

    private static final String HANDLER_NAME = "set_profile_settings";

    public String getName() {
        return HANDLER_NAME;
    }

    public Response<SetProfileSettingsResponse> handle(Request<?> msg) {
        return null;
    }
}
