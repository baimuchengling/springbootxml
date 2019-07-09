package com.hzl.controller;

import com.hzl.entity.User;
import com.hzl.service.UserService;
import com.hzl.util.DataUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Description:
 * @Author: zhilin
 * @CreateDT: 2019-06-20 22:07
 **/

@Controller
@RequestMapping("user")
public class UserController {

    private final static Logger LOGGER= LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/insertUser")
    @Transactional
    public String insertUser(User user){

        user.setUserId(DataUtil.generateId());
        LOGGER.info(user.toString());
        //userService.insertUser(user);
        return "success";
    }

    @RequestMapping(value = "/test")
    public String test(){
        LOGGER.info("test");
        return "testooo";
    }
}
