package com.hzl.config;

import com.hzl.entity.User;
import com.hzl.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.Optional;

/**
 * @ClassName: MyShiroRealm
 * @Description:
 * @Author: zhilin
 * @CreateDT: 2019-07-07 22:27
 **/

public class MyShiroRealm extends AuthorizingRealm {

    @Resource
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
        User user= (User) principalCollection.getPrimaryPrincipal();
        System.out.println(user.toString());

        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        //获取用户的输入的账号.
        String username=(String) authenticationToken.getPrincipal();
        System.out.println("用户名："+username);
        //通过username从数据库中查找 User对象，如果找到，没找到.
        //实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
        User user=userService.findByUserName(username);

        if (user==null){
            throw new UnknownAccountException("不知道用户名或密码");
        }
        System.out.println("数据库密码："+user.getPassword());
        SimpleAuthenticationInfo simpleAuthenticationInfo=
                new SimpleAuthenticationInfo(username,user.getPassword(),getName());
        //参数：用户，数据库密码，real名称
        return simpleAuthenticationInfo;
    }
}
