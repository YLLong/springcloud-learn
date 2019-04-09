package com.yll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch63ProviderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch63ProviderServiceApplication.class, args);
    }

}
