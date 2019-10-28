//package com.lingshi.common.config;
//
//import io.swagger.annotations.Contact;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
///**
// * @ClassName: Swgger2
// * @Author: chenxihua
// * @Date: 2019/9/10 9:13
// * @Version: 1.0
// */
//@EnableSwagger2
//@Configuration
//public class Swgger2 {
//
//    @Value("${swagger.enable:true}")
//    boolean isEnableSwagger;
//    @Value("${swagger.basePackage:com.gosuncn.controller}")
//    String basePackage;
//    @Value("${swagger.title:后台服务}")
//    String title;
//    @Value("${swagger.description:陈喜华}")
//    String description;
//    @Value("${swagger.termsOfServiceUrl: }")
//    String termsOfServiceUrl;
//    @Value("${swagger.pathMap:/}")
//    String pathMap;
//    @Value("${swagger.name: lingshi}")
//    String name;
//    @Value("${swagger.url: chenxihua.club}")
//    String url;
//    @Value("${swagger.email: chenxihua@qq.com}")
//    String email;
//    @Value("${swagger.version: 1.0}")
//    String version;
//
//
//    @Bean
//    public Docket createRestApi(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .enable(isEnableSwagger)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage(basePackage))
//                .paths(PathSelectors.any())
//                .build().pathMapping(pathMap);
//    }
//
//    private ApiInfo apiInfo(){
//        return new ApiInfoBuilder()
//                .title(title)
//                .description(description)
//                .termsOfServiceUrl(termsOfServiceUrl)
//                .contact("http://chenxihua.club")
//                .version(version)
//                .build();
//    }
//
//}
