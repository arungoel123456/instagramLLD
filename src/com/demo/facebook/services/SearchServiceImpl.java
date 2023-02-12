package com.demo.facebook.services;

import com.demo.facebook.dto.*;
import com.demo.facebook.interfaces.*;

import java.util.*;

public class SearchServiceImpl implements SearchService {
    @Override
    public List<User> searchUser(String searchKey) {
        // where should I get it from?? should I make a search catalog where I keep all
        // the users and posts??

        Map<String, User> users= SearchCatalog.getInstance().getUsers();

        // for now, I am returning the complete list
        return null;
    }

    @Override
    public List<Post> searchPost(String searchKey) {
        return null;
    }
}
