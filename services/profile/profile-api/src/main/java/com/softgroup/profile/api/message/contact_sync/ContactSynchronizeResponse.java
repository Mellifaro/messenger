package com.softgroup.profile.api.message.contact_sync;

import com.softgroup.common.model.Contact;
import com.softgroup.common.protocol.ResponseData;

import java.util.List;

/**
 * Created by Виктор on 23.02.2017.
 */
public class ContactSynchronizeResponse implements ResponseData{
    private static final long serialVersionUID = 7431394305767199598L;

    private List<Contact> contactList;

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
}
