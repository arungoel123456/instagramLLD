package com.demo.facebook.followRequestState;

import com.demo.facebook.dto.*;
import com.demo.facebook.services.*;

public class SuccessfulState extends State{

    EmailNotificationServiceImpl emailNotificationService;
    @Override
    public void notifyUser(User receiver) {
        emailNotificationService.createNotification("Your follow request is accepted. Please message!", receiver);
    }
}
