package com.demo.facebook.services;

import com.demo.facebook.dto.*;
import com.demo.facebook.interfaces.*;

import java.util.*;

public class TimelineServiceImpl implements TimelineService {
    @Override
    public List<Post> fetchTimeline(User user) {
        // how should I implement this, should I show using pubsub method?
        pullPostsOfCelebs(user);
        return user.getProfile().getTimeline().getPosts();
    }

    public void addToTimelines(Post post, List<User> users){
        for(int i=0;i<users.size();i++){
            users.get(i).getProfile().getTimeline().addPost(post);
        }
    }
    private void pullPostsOfCelebs(User user){
        List<User> followings=  user.getProfile().getFollowings();
        for(int i=0;i<followings.size(); i++){
            if(followings.get(i).isCelebrity()){
                user.getProfile().getTimeline().addPosts( followings.get(i).getProfile().getPosts() );
            }
        }
    }
}
