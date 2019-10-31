package com.herbert.doorplate.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/28 22:28
 * @Description:消息总线启动
 */
@SpringBootApplication
@EnableConfigServer
//@EnableDiscoveryClient
public class ConfigServerBusStart {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerBusStart.class, args);
    }
}
