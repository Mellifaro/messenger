package com.softgroup.common.dao.api.entities;

import sun.plugin2.message.Conversation;

import javax.persistence.*;

/**
 * Created by Виктор on 03.04.2017.
 */
@Entity
@Table(name = "message_statuses")
public class MessageStatus extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "message_id", nullable = false)
    private Message message;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private MessageStatusType status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id", nullable = false)
    private ProfileEntity profileEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "conversation_id", nullable = false)
    private Conversation conversation;

    @Column(name = "confirm_date")
    private Long confirmDate;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public MessageStatusType getStatus() {
        return status;
    }

    public void setStatus(MessageStatusType status) {
        this.status = status;
    }

    public ProfileEntity getProfileEntity() {
        return profileEntity;
    }

    public void setProfileEntity(ProfileEntity profileEntity) {
        this.profileEntity = profileEntity;
    }

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }

    public Long getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Long confirmDate) {
        this.confirmDate = confirmDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MessageStatus)) return false;

        MessageStatus that = (MessageStatus) o;

        if (status != that.status) return false;
        return confirmDate.equals(that.confirmDate);

    }

    @Override
    public int hashCode() {
        int result = status.hashCode();
        result = 31 * result + confirmDate.hashCode();
        return result;
    }
}
