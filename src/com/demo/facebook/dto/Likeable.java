package com.demo.facebook.dto;

import java.util.*;

public abstract class Likeable {
    private List<Like> likes;

    public Likeable(){
        likes= new ArrayList<Like>();
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public void addLike(Like like){
        likes.add(like);
    }
    public void removeLike(Like like){
        likes.remove(like);
    }
}
