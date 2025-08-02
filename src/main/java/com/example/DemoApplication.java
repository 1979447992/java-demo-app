package com.example.simplewebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // 标记这是一个RESTful控制器
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/hello") // 定义一个GET请求接口，路径为 /hello
    public String hello() {
        // 返回一段话，方便验证部署是否成功
        return "Hello from Jenkins Pipeline! This is build #" + System.getenv("BUILD_NUMBER") + " from Spring Boot app!";
    }
}