package com.demo.facebook.services;

import com.demo.facebook.dto.*;
import com.demo.facebook.enums.*;
import com.demo.facebook.followRequestState.*;
import com.demo.facebook.interfaces.*;

import java.util.*;

public class FollowRequestServiceImpl implements FollowRequestService {
    @Override
    public List<FollowRequest> fetchAllRequests(User user) {
        // how to fetch all the requests? where had we stored all the requests?
        return user.getProfile().getFollowRequests();
    }

    @Override
    public void createFollowRequests(User sender, User receiver) {
        FollowRequest followRequest= new FollowRequest(sender, receiver);

        // added follow requests
        receiver.getProfile().addFollowRequest(followRequest);
        followRequest.getFollowRequestStatus().notifyUser(receiver);
    }

    @Override
    public void changeFollowRequestStatus(FollowRequest request, State state) {
        request.setFollowRequestStatus(state);
        state.notifyUser(request.getSender());
        // again, will I get the status and request or will I get requestId??
        // Now I want to fire notification on the basis of different state of request
    }
}
