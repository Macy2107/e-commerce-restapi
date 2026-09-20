package com.example.great.great;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.example.great.great")
//@EnableAutoConfiguration
public class ECommerceApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ECommerceApiApplication.class, args);
    }

}
