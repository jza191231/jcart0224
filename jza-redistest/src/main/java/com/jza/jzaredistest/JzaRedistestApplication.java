package com.jza.jzaredistest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jza.jzaredistest.mapper")
public class JzaRedistestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JzaRedistestApplication.class, args);
    }

}
