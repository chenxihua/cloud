package com.lingshi;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
@EnableSwagger2Doc
public class ServerZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerZuulApplication.class, args);
    }


    /**
     * 配置Swagger
     */
    @Component
    @Primary
    class DocumentationConfig implements SwaggerResourcesProvider {
        @Override
        public List<SwaggerResource> get() {
            List resource=new ArrayList<>();
            //name可以随便写，location前缀要与zuul配置的path一致。zuul开了token验证,要加上token,否则不用加?token=1
            resource.add(swaggerResource("myapp-produce","/produce-server/v2/api-docs?token=1","2.0"));
            resource.add(swaggerResource("myapp-consum","/consum-server/v2/api-docs?token=1","2.0"));
            return resource;
        }

        //name可以随便写，location前缀要与zuul配置的path一致
        private SwaggerResource swaggerResource(String name,String location,String version){
            SwaggerResource swaggerResource=new SwaggerResource();
            swaggerResource.setName(name);
            swaggerResource.setLocation(location);
            swaggerResource.setSwaggerVersion(version);
            return swaggerResource;
        }
    }


}
