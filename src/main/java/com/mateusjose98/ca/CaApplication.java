package com.mateusjose98.ca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaApplication.class, args);
    }

}
