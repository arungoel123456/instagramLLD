package com.demo.facebook.dto;

public class Notification {
    private String description;

    public Notification(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
