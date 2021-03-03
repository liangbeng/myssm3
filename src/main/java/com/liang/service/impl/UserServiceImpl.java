package com.liang.service.impl;

import com.liang.dao.UserDao;
import com.liang.pojo.User;
import com.liang.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private UserDao userDao;

    @Override
    public User findUserById(int id) {
        logger.info("query user info;th id is:{}",id);
        return userDao.findUserById(id);
    }

    @Transactional
    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
        logger.info("add user success;th user is:{}",user);
    }
}
