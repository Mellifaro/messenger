package com.softgroup.profile.api.message.contactSync;

import com.softgroup.common.protocol.RequestData;
import com.softgroup.profile.api.model.Contact;

import java.util.List;

/**
 * Created by Виктор on 13.03.2017.
 */
public class ContactSyncRequest implements RequestData {
    private static final long serialVersionUID = -398253932013621621L;

    private List<Contact> addedContacts;
    private List<Contact> removedContacts;

    public List<Contact> getAddedContacts() {
        return addedContacts;
    }

    public void setAddedContacts(List<Contact> addedContacts) {
        this.addedContacts = addedContacts;
    }

    public List<Contact> getRemovedContacts() {
        return removedContacts;
    }

    public void setRemovedContacts(List<Contact> removedContacts) {
        this.removedContacts = removedContacts;
    }
}
