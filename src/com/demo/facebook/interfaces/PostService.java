package com.demo.facebook.interfaces;

import com.demo.facebook.dto.*;

public interface PostService {
    public void createPost(User user, String description);
    public void commentOnPost(Comment comment, Post post);
    public void likeOnPost(Post post, Like like);
    public void unLikeOnPost();
}
