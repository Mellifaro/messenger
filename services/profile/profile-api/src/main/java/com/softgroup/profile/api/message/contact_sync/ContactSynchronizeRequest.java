package com.softgroup.profile.api.message.contact_sync;

import com.softgroup.common.model.Contact;
import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by Виктор on 23.02.2017.
 */
public class ContactSynchronizeRequest implements RequestData{
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
