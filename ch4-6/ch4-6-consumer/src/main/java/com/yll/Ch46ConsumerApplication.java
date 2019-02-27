package com.yll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Ch46ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch46ConsumerApplication.class, args);
    }

}
