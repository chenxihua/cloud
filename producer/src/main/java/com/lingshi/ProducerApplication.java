package com.lingshi;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
//@EnableSwagger2
@EnableSwagger2Doc
public class ProducerApplication {

    private final static Logger logger = LoggerFactory.getLogger(ProducerApplication.class);

    public static void main(String[] args) {
        logger.info("producer 开始启动...");
        SpringApplication.run(ProducerApplication.class, args);
        logger.info("producer 启动成功...");
    }

}
