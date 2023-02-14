package com.demo.facebook.dto;

import com.demo.facebook.enums.*;
import com.demo.facebook.followRequestState.*;

public class FollowRequest {
    private User sender;
    private User receiver;
    private State followRequestStatus;

    public FollowRequest(User sender, User receiver) {
        this.sender = sender;
        this.receiver = receiver;
        this.followRequestStatus = new HoldState();
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

    public State getFollowRequestStatus() {
        return followRequestStatus;
    }

    public void setFollowRequestStatus(State followRequestStatus) {
        this.followRequestStatus = followRequestStatus;
    }
}
