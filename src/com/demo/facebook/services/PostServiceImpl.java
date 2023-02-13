package com.demo.facebook.services;

import com.demo.facebook.dto.*;
import com.demo.facebook.interfaces.*;

public class PostServiceImpl implements PostService {
    @Override
    public void createPost(User user, String description) {
        Post post= new Post(description, user);
        user.getProfile().addPost(post);

        // should I call timeline service to push to everyone's timeline??
    }

    @Override
    public void commentOnPost(Comment comment, Post post) {
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
