package com.liang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @author Liangxp
 * @date 2019/12/6 15:34
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinApp {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinApp.class, args);
    }
}
