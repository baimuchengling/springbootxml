package com.hzl.dao;

import com.hzl.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @ClassName: UserDao
 * @Description:
 * @Author: zhilin
 * @CreateDT: 2019-06-23 07:25
 **/
@Component
public interface UserDao {

    int login(@Param("userId") String username, @Param("password") String password);

    void insertUser(User user);

    void deleteUser(User user);

    void updateUser(User user);

    void selectUser(User user);

    void queryAll();

    User findByUserName(String username);

}
