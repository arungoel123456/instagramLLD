package com.demo.facebook.interfaces;

import com.demo.facebook.dto.*;

import java.util.*;

public interface SearchService {
    public List<User> searchUser(String searchKey);
    public List<Post> searchPost(String searchKey);
}
