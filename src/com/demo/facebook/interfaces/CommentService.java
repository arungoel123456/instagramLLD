package com.demo.facebook.interfaces;

import com.demo.facebook.dto.*;

public interface CommentService {
    public void createComment(String description, User createdBy, Post comment);
    public void likeOnComment(Like like, Comment comment);
    void unlikeOnComment(Like like, Comment comment);

    public void commentOnComment();
}
