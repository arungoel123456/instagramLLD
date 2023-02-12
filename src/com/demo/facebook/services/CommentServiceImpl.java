package com.demo.facebook.services;

import com.demo.facebook.dto.*;
import com.demo.facebook.interfaces.*;

public class CommentServiceImpl implements CommentService {

    @Override
    public void createComment(String description, User createdBy, Post post) {
        Comment comment= new Comment(description,createdBy, post);
    }

    @Override
    public void likeOnComment(Like like, Comment comment) {
        // will I get like directly here , if yes how? Shouldn't I create a like?
        comment.addLike(like);
    }

    @Override
    public void unlikeOnComment(Like like, Comment comment) {
        // will I get like directly here , if yes how?
        comment.removeLike(like);
    }

    @Override
    public void commentOnComment() {
        // should I keep comments list in class comment??
    }
}
