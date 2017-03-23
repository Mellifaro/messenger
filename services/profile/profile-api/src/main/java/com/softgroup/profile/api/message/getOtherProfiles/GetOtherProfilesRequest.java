package com.softgroup.profile.api.message.getOtherProfiles;

import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by Виктор on 13.03.2017.
 */
public class GetOtherProfilesRequest implements RequestData {
    private static final long serialVersionUID = -3952758678326330898L;

    private List<Integer> listOfId;

    public List<Integer> getListOfId() {
        return listOfId;
    }

    public void setListOfId(List<Integer> listOfId) {
        this.listOfId = listOfId;
    }
}
