package com.learn.kernel.pigeon;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: mi
 * @Date: 2023−03−26 11:13
 * @Description: 通讯模块启动类
 */
@SpringBootApplication
public class PigeonApplication {

    public static void main(String[] args) {
        SpringApplication.run(PigeonApplication.class,args);
    }

}
