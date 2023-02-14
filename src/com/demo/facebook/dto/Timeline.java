package com.demo.facebook.dto;

import java.util.*;

public class Timeline {
    private List<Post> posts;

    public Timeline() {
        this.posts = new ArrayList<Post>();
    }
    public void addPost(Post post){
        posts.add(post);
    }

    public void addPosts(List<Post> posts){
        this.posts.addAll(posts);
    }
    public List<Post> getPosts(){
        return posts;
    }
}
