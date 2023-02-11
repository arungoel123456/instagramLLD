package com.demo.facebook.dto;

import java.util.*;

public class Comment {
    private String description;
    private User createdBy;
    private Post post;
    private List<Like> likes;

    public Comment(String description, User createdBy, Post post) {
        this.description = description;
        this.createdBy = createdBy;
        this.post = post;
        likes= new ArrayList<Like>();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
    public void addLike(Like like){
        likes.add(like);
    }
}
