package com.shouyu.dframework.dframework.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan({"com.shouyu.dframework.dframework.demo.infrastructure.mapper"})
public class DframeworkDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DframeworkDemoApplication.class, args);
    }

}
