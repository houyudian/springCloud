package com.fh.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.fh.shop.member.mapper")
@EnableDiscoveryClient
@EnableFeignClients
public class ShopMemberApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopMemberApiApplication.class, args);
    }

}
