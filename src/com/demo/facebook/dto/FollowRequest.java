package com.demo.facebook.dto;

import com.demo.facebook.enums.*;

public class FollowRequest {
    private User sender;
    private User receiver;
    private FollowRequestStatus followRequestStatus;

    public FollowRequest(User sender, User receiver, FollowRequestStatus followRequestStatus) {
        this.sender = sender;
        this.receiver = receiver;
        this.followRequestStatus = followRequestStatus;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public FollowRequestStatus getFollowRequestStatus() {
        return followRequestStatus;
    }

    public void setFollowRequestStatus(FollowRequestStatus followRequestStatus) {
        this.followRequestStatus = followRequestStatus;
    }
}
