package com.hzl.service.impl;

import com.hzl.dao.UserDao;
import com.hzl.entity.User;
import com.hzl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @Description: 实现类
 * @Author: zhilin
 * @CreateDT: 2019-06-20 21:30
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int login(String username, String password) {
        return userDao.login(username,password);
    }

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public User findByUserName(String username) {
        return userDao.findByUserName(username);
    }

    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void selectUser(User user) {
        userDao.selectUser(user);
    }

    @Override
    public void queryAll() {
        this.userDao.queryAll();
    }
}
