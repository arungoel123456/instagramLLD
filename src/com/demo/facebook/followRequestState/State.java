package com.demo.facebook.followRequestState;

import com.demo.facebook.dto.*;

abstract public class State {
    public abstract void notifyUser(User receiver);
}
