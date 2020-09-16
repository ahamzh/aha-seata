package com.halo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author shoufeng
 */
@SpringBootApplication
@EnableFeignClients
public class HaloConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(HaloConsumerApp.class, args);
    }
}
