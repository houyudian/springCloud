package com.fh.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.fh.shop.log.mapper")
public class ShopLogApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopLogApiApplication.class, args);
    }

}
