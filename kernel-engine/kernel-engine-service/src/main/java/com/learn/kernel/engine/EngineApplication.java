package com.learn.kernel.engine;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: mi
 * @Date: 2023−03−16 21:30
 * @Description: 数据源管理
 */
@EnableDubbo
@SpringBootApplication
public class EngineApplication {

    public static void main(String[] args) {
        SpringApplication.run(EngineApplication.class,args);
    }

}
