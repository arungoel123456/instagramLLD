package com.demo.facebook.interfaces;

import com.demo.facebook.dto.*;

public interface CommentFunctionsByUser {
    public void createComment(String description, User createdBy, Post comment);
    public void likeOnComment(Like like, Comment comment);
    public void unlikeOnComment();
    public void commentOnComment();
}
