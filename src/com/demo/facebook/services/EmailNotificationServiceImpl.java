package com.demo.facebook.services;

import com.demo.facebook.dto.*;
import com.demo.facebook.interfaces.*;

public class EmailNotificationServiceImpl implements NotificationService {
    @Override
    public void createNotification(String description, User user) {
        Notification notification= new Notification(description);
        sendNotification(user, notification);
    }

    @Override
    public void sendNotification(User user, Notification notification) {
        // send
        return;
    }
}
