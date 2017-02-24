package com.softgroup.profile.api.message.get_profile_settings;

import com.softgroup.common.model.ProfileSettings;
import com.softgroup.common.protocol.ResponseData;

/**
 * Created by Виктор on 23.02.2017.
 */
public class ProfileSettingsResponse implements ResponseData {
    private static final long serialVersionUID = 9139031141005628302L;

    private ProfileSettings settings;

    public ProfileSettings getSettings() {
        return settings;
    }

    public void setSettings(ProfileSettings settings) {
        this.settings = settings;
    }
}
