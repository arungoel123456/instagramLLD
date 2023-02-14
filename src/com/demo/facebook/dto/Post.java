package com.demo.facebook.dto;

import java.util.*;

public class Post extends Likeable {
    private String description;
    private User createdBy;
    private List<Comment> comments;

    public Post(String description, User createdBy) {
        super();
        this.description = description;
        this.createdBy = createdBy;
        this.comments = new ArrayList<Comment>();
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

    public void addComment(Comment comment){
        comments.add(comment);
        return;
    }

    @Override
    public String toString() {
        return "Post{" +
                "description='" + description + '\'' +
                ", createdBy=" + createdBy +
                ", comments=" + comments +
                '}';
    }
}
