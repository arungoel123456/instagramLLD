package com.demo.facebook.services;

import com.demo.facebook.dto.*;
import com.demo.facebook.interfaces.*;

public class PostServiceImpl implements PostService {
    @Override
    public void createPost(User user, String description) {
        Post post= new Post(description, user);

        // is it wise to add it in profile??
        user.getProfile().addPost(post);
    }

    @Override
    public void commentOnPost(Comment comment, Post post) {
        // is it right to store comments in post?
        post.addComment(comment);
    }

    @Override
    public void likeOnPost(Post post, Like like) {
        // will I get like object directly?
        post.addLike(like);
    }

    @Override
    public void unLikeOnPost() {

    }
}
