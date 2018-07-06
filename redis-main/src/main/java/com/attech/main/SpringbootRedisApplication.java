package com.attech.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Springboot集成Redis项目启动类
 *
 * @author Aaron
 * @version v1.0
 * @create 2018-07-06 16:11
 **/
@SpringBootApplication
@EnableScheduling
@EnableCaching
public class SpringbootRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRedisApplication.class, args);
    }

}