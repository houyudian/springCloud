package com.fh.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fh.shop.area.mapper")
public class ShopAreaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopAreaApiApplication.class, args);
    }

}
