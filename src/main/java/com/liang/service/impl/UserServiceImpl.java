package com.liang.service.impl;

import com.liang.dao.UserDao;
import com.liang.pojo.User;
import com.liang.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User findUserById(int id) {
        return userDao.findUserById(id);
    }

    @Transactional
    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);

    }
}
