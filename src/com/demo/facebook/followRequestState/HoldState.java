package com.demo.facebook.followRequestState;

import com.demo.facebook.dto.*;
import com.demo.facebook.services.*;

public class HoldState extends State{
    EmailNotificationServiceImpl emailNotificationService;
    @Override
    public void notifyUser(User receiver) {
        emailNotificationService.createNotification("You received a follow request", receiver);
    }
}
