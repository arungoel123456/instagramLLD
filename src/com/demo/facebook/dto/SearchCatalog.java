package com.demo.facebook.dto;

import java.util.*;

public class SearchCatalog {
    private Map<String, User> users;
    private Map<String, Post> posts;
    private static SearchCatalog searchCatalog= null;

    private SearchCatalog(){
        users= new HashMap<String, User>();
        posts= new HashMap<String, Post>();
    }

    public static SearchCatalog getInstance(){
        if(searchCatalog== null){
            searchCatalog= new SearchCatalog();
        }
        return searchCatalog;
    }
    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }

    public Map<String, Post> getPosts() {
        return posts;
    }

    public void setPosts(Map<String, Post> posts) {
        this.posts = posts;
    }

    public void addPost(Post post){
        posts.put(post.toString(), post);
    }
    public void addUser(User user){
        users.put(user.toString(), user);
    }
}
