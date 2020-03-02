package io.jza.jcartstoreback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.jza.jcartstoreback.dao")
public class JartStoreBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(JartStoreBackApplication.class, args);
    }

}
