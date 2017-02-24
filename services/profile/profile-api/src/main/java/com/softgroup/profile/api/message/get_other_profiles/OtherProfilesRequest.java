package com.softgroup.profile.api.message.get_other_profiles;

import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by Виктор on 23.02.2017.
 */
public class OtherProfilesRequest implements RequestData {
    private static final long serialVersionUID = -3952758678326330898L;

    private List<Integer> listOfId;

    public List<Integer> getListOfId() {
        return listOfId;
    }

    public void setListOfId(List<Integer> listOfId) {
        this.listOfId = listOfId;
    }
}
