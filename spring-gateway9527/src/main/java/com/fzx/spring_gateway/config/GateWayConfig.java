package com.fzx.spring_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator router(RouteLocatorBuilder builder){
        /**
         * 通过url：http://localhost:95217/bili -->
         *   http://www.bilibili.com/bili
         */
        return builder.routes()
                .route("path_bilibili", r -> r.path("/").uri("http://www.bilibili.com"))
                .build();
    }

}
