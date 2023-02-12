package com.demo.facebook.interfaces;

import com.demo.facebook.dto.*;
import com.demo.facebook.enums.*;

public interface FollowRequestService {
    public void fetchAllRequests();
    public void createFollowRequests(User sender, User receiver);
    public void changeFollowRequestStatus(FollowRequest request, FollowRequestStatus status);
}
