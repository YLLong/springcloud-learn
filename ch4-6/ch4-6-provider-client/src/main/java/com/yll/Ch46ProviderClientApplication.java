package com.yll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class Ch46ProviderClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch46ProviderClientApplication.class, args);
    }

}
