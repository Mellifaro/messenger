package com.softgroup.profile.api.message.getContactProfiles;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.profile.api.model.Profile;

import java.util.List;

/**
 * Created by Виктор on 13.03.2017.
 */
public class ContactProfilesResponse implements ResponseData {
    private static final long serialVersionUID = 2443261391339528805L;

    private List<Profile> profileList;

    public List<Profile> getProfileList() {
        return profileList;
    }

    public void setProfileList(List<Profile> profileList) {
        this.profileList = profileList;
    }
}