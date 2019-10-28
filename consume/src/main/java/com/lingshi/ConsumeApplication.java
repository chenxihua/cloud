package com.lingshi;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableSwagger2Doc
//@EnableHystrix      // 开启
//@EnableEurekaClient  服务消费者, 不需要加这个注解
public class ConsumeApplication {

    private final static Logger logger = LoggerFactory.getLogger(ConsumeApplication.class);


    public static void main(String[] args) {
        logger.warn("consume 开始启动...");
        SpringApplication.run(ConsumeApplication.class, args);
        logger.warn("consume 启动成功...");
    }


    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
