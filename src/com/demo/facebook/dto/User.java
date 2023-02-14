package com.demo.facebook.dto;

public class User {
    private String name;
    private String email;
    private String password;
    private Profile profile;
    private boolean isCelebrity;

    public User(String name, String email, String password, Profile profile, boolean isCelebrity) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.profile = profile;
        this.isCelebrity = isCelebrity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public boolean isCelebrity() {
        return isCelebrity;
    }

    public void setCelebrity(boolean celebrity) {
        isCelebrity = celebrity;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", profile=" + profile +
                ", isCelebrity=" + isCelebrity +
                '}';
    }
}
