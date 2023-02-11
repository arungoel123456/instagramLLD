package com.demo.facebook.services;

import com.demo.facebook.dto.*;
import com.demo.facebook.interfaces.*;

public class CommentFunctionsByUserImpl implements CommentFunctionsByUser {

    PostFunctionsByUser postFunctionsByUser;

    @Override
    public void createComment(String description, User createdBy, Post post) {
        Comment comment= new Comment(description,createdBy, post);

    }

    @Override
    public void likeOnComment(Like like, Comment comment) {
        comment.addLike(like);
    }

    @Override
    public void unlikeOnComment() {

    }

    @Override
    public void commentOnComment() {

    }
}
