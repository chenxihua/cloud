package com.lingshi.eureka;

//import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//@EnableAdminServer
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

    private final static Logger logger = LoggerFactory.getLogger(EurekaApplication.class);

    public static void main(String[] args) {
        logger.warn("Eureka 程序正在启动...");
        SpringApplication.run(EurekaApplication.class, args);
        logger.warn("Eureka 启动成功...");
    }

}
