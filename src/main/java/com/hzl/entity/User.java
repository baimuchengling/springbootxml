package com.hzl.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * @ClassName: User
 * @Description: 用户信息类
 * @Author: zhilin
 * @CreateDT: 2019-06-20 21:04
 **/

public class User {

    private String userId;    //用户编号

    @NotBlank
    private String userName;  //用户名

    private String password;

    private Integer userSex;  //性别，1代表男 0代表女

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;  //出生日期

    private String nativePlace; //籍贯

    private String telephone;  //手机号

    @Email
    private String email;      //邮箱

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", birthDate=" + birthDate +
                ", nativePlace='" + nativePlace + '\'' +
                ", telephone=" + telephone +
                ", email='" + email + '\'' +
                '}';
    }
}
