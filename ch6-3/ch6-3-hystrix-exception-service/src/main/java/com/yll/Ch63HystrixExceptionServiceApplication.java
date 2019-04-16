package com.yll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableHystrix
@EnableDiscoveryClient
@EnableFeignClients
public class Ch63HystrixExceptionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch63HystrixExceptionServiceApplication.class, args);
    }

}
