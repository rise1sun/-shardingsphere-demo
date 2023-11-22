package com.feng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jiangfeng
 * @date $DATE
 */
@SpringBootApplication
@MapperScan(basePackages = "com.feng.mapper")
public class WMSApplication {
    public static void main(String[] args){
        SpringApplication.run(WMSApplication.class,args);
    }
}