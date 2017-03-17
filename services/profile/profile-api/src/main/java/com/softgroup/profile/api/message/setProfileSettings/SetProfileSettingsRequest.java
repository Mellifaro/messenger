package com.softgroup.profile.api.message.setProfileSettings;

import com.softgroup.common.protocol.RequestData;
import com.softgroup.profile.api.model.ProfileSettings;

/**
 * Created by Виктор on 13.03.2017.
 */
public class SetProfileSettingsRequest implements RequestData{
    private static final long serialVersionUID = -4244409425602051793L;

    private ProfileSettings settings;

    public ProfileSettings getSettings() {
        return settings;
    }

    public void setSettings(ProfileSettings settings) {
        this.settings = settings;
    }
}
