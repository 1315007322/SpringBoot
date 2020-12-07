package com.yhf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootAppliction 来标注这是一个  springboot 应用
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        springboot 应用启动起来

        SpringApplication.run(Application.class,args);
    }

}
