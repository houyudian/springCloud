package com.fh.shop.registereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegisterEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterEurekaApplication.class, args);
    }

}
