package com.yll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ch46EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch46EurekaServerApplication.class, args);
    }

}
