package com.lingshi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ProducerApplication {

    private final static Logger logger = LoggerFactory.getLogger(ProducerApplication.class);

    public static void main(String[] args) {
        logger.info("producer 开始启动...");
        SpringApplication.run(ProducerApplication.class, args);
        logger.info("producer 启动成功...");
    }

}
