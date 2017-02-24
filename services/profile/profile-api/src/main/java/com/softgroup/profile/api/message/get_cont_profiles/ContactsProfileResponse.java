package com.softgroup.profile.api.message.get_cont_profiles;

import com.softgroup.common.model.Profile;
import com.softgroup.common.protocol.ResponseData;

import java.util.List;

/**
 * Created by Виктор on 23.02.2017.
 */
public class ContactsProfileResponse implements ResponseData {
    private static final long serialVersionUID = 2443261391339528805L;

    private List<Profile> profileList;

    public List<Profile> getProfileList() {
        return profileList;
    }

    public void setProfileList(List<Profile> profileList) {
        this.profileList = profileList;
    }
}
