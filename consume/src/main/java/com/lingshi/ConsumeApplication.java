package com.lingshi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableEurekaClient
public class ConsumeApplication {

    private final static Logger logger = LoggerFactory.getLogger(ConsumeApplication.class);


    public static void main(String[] args) {
        logger.warn("consume 开始启动...");
        SpringApplication.run(ConsumeApplication.class, args);
        logger.warn("consume 启动成功...");
    }


}
