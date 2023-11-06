package com.android.service;

import com.android.pojo.User;


public interface UserService {
    User selectByName(String username);

    User login(String username, String password);

    boolean add(User user);
}


