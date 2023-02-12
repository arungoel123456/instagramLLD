package com.demo.facebook.services;

import com.demo.facebook.dto.*;
import com.demo.facebook.enums.*;
import com.demo.facebook.interfaces.*;

public class FollowRequestServiceImpl implements FollowRequestService {
    @Override
    public void fetchAllRequests() {
        // how to fetch all the requests? where had we stored all the requests?
    }

    @Override
    public void createFollowRequests(User sender, User receiver) {
        FollowRequest followRequest= new FollowRequest(sender, receiver, FollowRequestStatus.HOLD);

    }

    @Override
    public void changeFollowRequestStatus(FollowRequest request, FollowRequestStatus status) {
        request.setFollowRequestStatus(status);
        // again, will I get the status and request or will I get requestId??
        // Now I want to fire notification on the basis of different state of request
    }
}
