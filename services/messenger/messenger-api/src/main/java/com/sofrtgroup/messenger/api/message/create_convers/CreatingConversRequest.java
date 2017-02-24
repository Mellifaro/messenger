package com.sofrtgroup.messenger.api.message.create_convers;

import com.softgroup.common.model.ConversationType;
import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by Виктор on 24.02.2017.
 */
public class CreatingConversRequest implements RequestData{
    private static final long serialVersionUID = -808878232527545336L;

    private ConversationType conversType;
    private List<Integer> membersIdList;

    public ConversationType getConversType() {
        return conversType;
    }

    public void setConversType(ConversationType conversType) {
        this.conversType = conversType;
    }

    public List<Integer> getMembersIdList() {
        return membersIdList;
    }

    public void setMembersIdList(List<Integer> membersIdList) {
        this.membersIdList = membersIdList;
    }
}
