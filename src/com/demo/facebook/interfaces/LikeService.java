package com.demo.facebook.interfaces;

import com.demo.facebook.dto.*;
import com.demo.facebook.enums.*;

public interface LikeService {
    public void likeOnPost(Post post, LikeType likeType, User user);
    public void unlikeOnPost(Post post, Like like);
    public void likeOnComment(Comment comment, LikeType likeType, User user);
    public void unlikeOnComment(Comment comment, Like like);
}
