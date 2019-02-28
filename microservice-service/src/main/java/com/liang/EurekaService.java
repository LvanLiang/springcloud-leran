package com.liang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: Liangxp
 * @Description:
 * @date: 2019/2/24 22:39
 */
@SpringBootApplication
@EnableEurekaServer // EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaService {
    public static void main(String[] args) {
        SpringApplication.run(EurekaService.class,args);
    }
}
