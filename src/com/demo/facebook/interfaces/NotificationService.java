package com.demo.facebook.interfaces;

import com.demo.facebook.dto.*;

public interface NotificationService {
    public void createNotification(String description, User user);
    public void sendNotification(User user, Notification notification);
}
