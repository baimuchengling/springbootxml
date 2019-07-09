package com.hzl.service;

import com.hzl.entity.User;

/**
 * @ClassName: UserService
 * @Description:
 * @Author: zhilin
 * @CreateDT: 2019-06-20 21:28
 **/

public interface UserService {

    int login(String username,String password);

    void insertUser(User user);

    User findByUserName(String username);

    void deleteUser(User user);

    void updateUser(User user);

    void selectUser(User user);

    void queryAll();

}
