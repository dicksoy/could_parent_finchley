package com.dicksoy.eureka.server.finchley;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerFinchleyApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerFinchleyApplication.class, args);
    }
}
