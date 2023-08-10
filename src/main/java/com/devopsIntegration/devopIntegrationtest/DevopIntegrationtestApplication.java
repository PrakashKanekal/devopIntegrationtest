package com.devopsIntegration.devopIntegrationtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopIntegrationtestApplication {

    public String getMessage() {
        return "Welcome to Springboot application";
    }

    public static void main(String[] args) {
        SpringApplication.run(DevopIntegrationtestApplication.class, args);
    }

}
