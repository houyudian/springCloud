package com.fh.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.fh.shop.cate.mapper")
@ServletComponentScan
public class ShopCateApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopCateApiApplication.class, args);
    }

}
