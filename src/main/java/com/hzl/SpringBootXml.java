package com.hzl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: SpringBootXml
 * @Description: 启动类
 * @Author: zhilin
 * @CreateDT: 2019-06-24 19:53
 **/

@SpringBootApplication
@MapperScan(basePackages = "com.hzl.dao")
public class SpringBootXml {

    public static void main(String[] args){

        SpringApplication.run(SpringBootXml.class,args);
    }
}
