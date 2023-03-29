package com.learn.kernel.authority;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: mi
 * @Date: 2023−02−22 20:23
 * @Description: Authority 主启动类
 */
@SpringBootApplication
@EnableDubbo
public class AuthorityApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthorityApplication.class,args);
    }

}
