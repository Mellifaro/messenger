package com.softgroup.common.dao.api.entities;

import sun.plugin2.message.Conversation;

import javax.persistence.*;

/**
 * Created by Виктор on 03.04.2017.
 */
@Entity
@Table(name = "messages")
public class MessageEntity extends BaseEntity{
    private static final long serialVersionUID = 8973881020347471240L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sender_id", nullable = false)
    private ProfileEntity sender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "conversation_id", nullable = false)
    private Conversation conversation;

    @Column(name = "payload_URL")
    private String payloadURL;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private MessageType type;

    @Column(name = "created_date")
    private Long createdDate;

    @Column(name = "server_received_data")
    private Long serverReceivedDate;

    public ProfileEntity getSender() {
        return sender;
    }

    public void setSender(ProfileEntity sender) {
        this.sender = sender;
    }

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }

    public String getPayloadURL() {
        return payloadURL;
    }

    public void setPayloadURL(String payloadURL) {
        this.payloadURL = payloadURL;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public Long getServerReceivedDate() {
        return serverReceivedDate;
    }

    public void setServerReceivedDate(Long serverReceivedDate) {
        this.serverReceivedDate = serverReceivedDate;
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MessageEntity)) return false;

        MessageEntity that = (MessageEntity) o;

        if (!payloadURL.equals(that.payloadURL)) return false;
        if (type != that.type) return false;
        if (!createdDate.equals(that.createdDate)) return false;
        return serverReceivedDate.equals(that.serverReceivedDate);

    }

    @Override
    public int hashCode() {
        int result = payloadURL.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + createdDate.hashCode();
        result = 31 * result + serverReceivedDate.hashCode();
        return result;
    }
}
