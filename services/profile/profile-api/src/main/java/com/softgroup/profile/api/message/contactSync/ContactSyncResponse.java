package com.softgroup.profile.api.message.contactSync;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.profile.api.model.Contact;

import java.util.List;

/**
 * Created by Виктор on 13.03.2017.
 */
public class ContactSyncResponse implements ResponseData {
    private static final long serialVersionUID = 7431394305767199598L;

    private List<Contact> contactList;

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
}
