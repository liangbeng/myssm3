package com.liang.dao;

import com.liang.pojo.User;

public interface UserDao {
    User findUserById(int id);
    void insertUser(User user);
}
