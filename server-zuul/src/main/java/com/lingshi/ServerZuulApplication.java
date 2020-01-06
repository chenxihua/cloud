package com.lingshi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@EnableCaching
@EnableZuulProxy
@SpringBootApplication
@EnableHystrix
@EnableFeignClients
public class ServerZuulApplication {

    private static final Logger logger = LoggerFactory.getLogger(ServerZuulApplication.class);

    public static void main(String[] args) {
        logger.warn("zuul 开始启动。。。");
        SpringApplication.run(ServerZuulApplication.class, args);
        logger.warn("zuul 启动结束。。。");
    }


    /**
     * 向Spring容器中定义RestTemplate对象
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }




}
