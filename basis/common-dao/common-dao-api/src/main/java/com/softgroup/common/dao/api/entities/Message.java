package com.softgroup.common.dao.api.entities;

import sun.plugin2.message.Conversation;

import javax.persistence.*;

/**
 * Created by Виктор on 03.04.2017.
 */
@Entity
@Table(name = "messages")
public class Message<T> extends BaseEntity{

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
        if (!(o instanceof Message)) return false;

        Message<?> message = (Message<?>) o;

        if (payloadURL != null ? !payloadURL.equals(message.payloadURL) : message.payloadURL != null) return false;
        if (type != message.type) return false;
        if (!createdDate.equals(message.createdDate)) return false;
        return serverReceivedDate != null ? serverReceivedDate.equals(message.serverReceivedDate) : message.serverReceivedDate == null;

    }

    @Override
    public int hashCode() {
        int result = payloadURL != null ? payloadURL.hashCode() : 0;
        result = 31 * result + type.hashCode();
        result = 31 * result + createdDate.hashCode();
        result = 31 * result + (serverReceivedDate != null ? serverReceivedDate.hashCode() : 0);
        return result;
    }
}
