package com.liang.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;

/**
 * @author Liangxp
 * @date 2019/12/5 20:16
 */
@RestController
public class ConfigClientRest {
    @Value("${urlPrefix}")
    private String urlPrefix;

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig()
    {
        String format = MessageFormat.format("applicationName:{0}***eurekaServers:{1}***port:{2}***urlPrefix:{3}",
                applicationName, eurekaServers, port, urlPrefix);
        System.out.println("******str: "+ format);
        return format;
    }

}
