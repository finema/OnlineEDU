package com.xatu.onlineedu;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@MapperScan(basePackages = "com.xatu.onlineedu.mapper")
public class OnlineeduManagementWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineeduManagementWebApplication.class, args);
    }

}
