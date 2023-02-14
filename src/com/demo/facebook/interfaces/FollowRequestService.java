package com.demo.facebook.interfaces;

import com.demo.facebook.dto.*;
import com.demo.facebook.enums.*;
import com.demo.facebook.followRequestState.*;

import java.util.*;

public interface FollowRequestService {
    public List<FollowRequest> fetchAllRequests(User user);
    public void createFollowRequests(User sender, User receiver);
    public void changeFollowRequestStatus(FollowRequest request, State state);
}
