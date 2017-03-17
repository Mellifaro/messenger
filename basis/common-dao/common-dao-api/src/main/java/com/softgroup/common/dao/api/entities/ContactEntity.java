package com.softgroup.common.dao.api.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Виктор on 17.03.2017.
 */
@Entity
@Table(name = "contacts")
public class ContactEntity implements Serializable{
    private static final long serialVersionUID = 3180111570947462349L;

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "contact_name")
    private String contactName;

    //TODO check for working
    @ElementCollection
    @CollectionTable(name = "phone_numbers")
    private List<String> phoneNumbers;

    //TODO change ProfileEntity @ManyToOne??
    @Column(name = "profile_id")
    private String profileId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }
}
