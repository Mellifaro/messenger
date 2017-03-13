package com.softgroup.profile.api.message.getProfileSettings;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.profile.api.model.ProfileSettings;

/**
 * Created by Виктор on 13.03.2017.
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
