package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {


        // 获取当前时间
        LocalDateTime now = LocalDateTime.now();
        
        // 定义时间格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        // 格式化时间
        String formattedNow = now.format(formatter);
        
        // 将原始字符串和当前时间拼接

        return "Hello DevOps Demo 2340! Version: 1.0.1 - 当前时间: " + formattedNow;


    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
