package com.turing.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        System.out.println("第一次提交");

        System.out.println("master分支创建");

        System.out.println("dev的分支创建");

        SpringApplication.run(DemoApplication.class, args);
    }

}
