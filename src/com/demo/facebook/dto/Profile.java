package com.demo.facebook.dto;

import java.util.*;

public class Profile {
    private boolean isPrivate;
    private List<User> followers;
    private List<User> followings;
    private List<Post> posts;
    private List<FollowRequest> followRequests;
    private Timeline timeline;

    public Timeline getTimeline() {
        return timeline;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    public List<FollowRequest> getFollowRequests() {
        return followRequests;
    }

    public void setFollowRequests(List<FollowRequest> followRequests) {
        this.followRequests = followRequests;
    }
    public void addFollowRequest(FollowRequest followRequest){
        this.followRequests.add(followRequest);
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<User> getFollowings() {
        return followings;
    }

    public void setFollowings(List<User> followings) {
        this.followings = followings;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
    public void addPost(Post post) {
        this.posts.add(post);
    }

}
