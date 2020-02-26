package io.jza.jcartadministrationback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.jza.jcartadministrationback.dao")
public class JartAdministrationBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(JartAdministrationBackApplication.class, args);
    }

}
