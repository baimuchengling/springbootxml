package com.hzl.controller;

import com.hzl.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: LoginController
 * @Description:
 * @Author: zhilin
 * @CreateDT: 2019-07-04 22:45
 **/
@Controller
public class LoginController {

    private static final Logger LOGGER= LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserService userService;

 /*   @RequestMapping("login")
    public String login(@RequestParam String username,@RequestParam String password){
        LOGGER.info(username+"/"+password);
        int result=userService.login(username,password);
        System.out.println("登陆成功："+result);
        return "redirect:/main";
    }*/
}
