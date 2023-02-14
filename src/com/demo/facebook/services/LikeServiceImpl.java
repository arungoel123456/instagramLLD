package com.demo.facebook.services;

import com.demo.facebook.dto.*;
import com.demo.facebook.enums.*;
import com.demo.facebook.interfaces.*;

public class LikeServiceImpl implements LikeService {
    PostServiceImpl postService= new PostServiceImpl();
    CommentServiceImpl commentService= new CommentServiceImpl();

    @Override
    public void likeOnPost(Post post, LikeType likeType, User user) {
        Like like= new Like(likeType, user, post, null);
        // should I add like in post also??
        postService.likeOnPost(post, like);
    }

    @Override
    public void unlikeOnPost(Post post, Like like) {
        // should I make this in post service??
        post.removeLike(like);
    }

    @Override
    public void likeOnComment(Comment comment, LikeType likeType, User user) {
        Like like= new Like(likeType, user,null, comment);
        // should I add it to comment also??
        commentService.likeOnComment(like, comment);
    }

    @Override
    public void unlikeOnComment(Comment comment, Like like) {
        // should I make this in commentService??
    }
}
