package com.liang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: Liangxp
 * @Description:
 * @date: 2019/2/24 15:19
 */
@SpringBootApplication
@EnableEurekaClient   //本服务启动后会自动注册进eureka服务中
@EnableCircuitBreaker //对hystrixR熔断机制的支持
public class ProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class, args);
    }
}
