package com.demo.facebook.interfaces;

import com.demo.facebook.dto.*;

import java.util.*;

public interface TimelineService {
    public List<Post> fetchTimeline(User user);
}
