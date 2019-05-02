package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoZmApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoZmApplication.class, args);
        System.out.println("================Spring boot Starter==================");
    }

    @GetMapping("/")
    public String hello(){
        return "张美是大傻狗!";
    }

}
