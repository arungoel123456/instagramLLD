package com.demo.facebook.dto;

import java.util.*;

public class Post {
    private String description;
    private User createdBy;
    private List<Comment> comments;
    private List<Like> likes;

    public Post(String description, User createdBy) {
        this.description = description;
        this.createdBy = createdBy;
        this.comments = new ArrayList<Comment>();
        this.likes= new ArrayList<Like>();
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

    public void addLike(Like like){
        likes.add(like);
    }

    @Override
    public String toString() {
        return "Post{" +
                "description='" + description + '\'' +
                ", createdBy=" + createdBy +
                ", comments=" + comments +
                ", likes=" + likes +
                '}';
    }
}
