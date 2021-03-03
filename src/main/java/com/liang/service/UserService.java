package com.liang.service;

import com.liang.pojo.User;

public interface UserService {
    User findUserById(int id);
    void insertUser(User user);
}
