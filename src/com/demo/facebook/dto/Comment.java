package com.demo.facebook.dto;

import java.util.*;

public class Comment extends Likeable {
    private String description;
    private User createdBy;
    private Post post;

    public Comment(String description, User createdBy, Post post) {
        super();
        this.description = description;
        this.createdBy = createdBy;
        this.post = post;
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

}
