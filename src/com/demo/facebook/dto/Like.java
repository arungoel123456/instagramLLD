package com.demo.facebook.dto;

import com.demo.facebook.enums.*;

public class Like {
    private LikeType likeType;
    private LikeOn likeOn;
    private User createdBy;
    private Post post;
    private Comment comment;

    public Like(LikeType likeType, LikeOn likeOn, User createdBy, Post post, Comment comment) {
        this.likeType = likeType;
        this.likeOn = likeOn;
        this.createdBy = createdBy;
        this.post = post;
        this.comment = comment;
    }

    public LikeType getLikeType() {
        return likeType;
    }

    public void setLikeType(LikeType likeType) {
        this.likeType = likeType;
    }

    public LikeOn getLikeOn() {
        return likeOn;
    }

    public void setLikeOn(LikeOn likeOn) {
        this.likeOn = likeOn;
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

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
