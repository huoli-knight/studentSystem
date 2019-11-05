package com.suixingpay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.suixingpay.model.mapper")
public class DemoApplication {

    public static void main(String[] args) {SpringApplication.run(DemoApplication.class, args);
    }
}
