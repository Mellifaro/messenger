package com.softgroup.common.dao.api.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Виктор on 17.03.2017.
 */
@Entity
@Table(name = "conversation_details")
public class ConversationDetailsEntity implements Serializable{
    private static final long serialVersionUID = -2772537505384144371L;

    @Id
    @OneToOne
    @Column(name = "conversation_id")
    private ConversationEntity conversation;

    @ManyToMany
    //TODO finish ManyToMany
    private List<ProfileEntity> members;

    public ConversationEntity getConversation() {
        return conversation;
    }

    public void setConversation(ConversationEntity conversation) {
        this.conversation = conversation;
    }

    public List<ProfileEntity> getMembers() {
        return members;
    }

    public void setMembers(List<ProfileEntity> members) {
        this.members = members;
    }
}
