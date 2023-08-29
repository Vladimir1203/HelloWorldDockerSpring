package com.example.helloworlddocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldDockerApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }

}
