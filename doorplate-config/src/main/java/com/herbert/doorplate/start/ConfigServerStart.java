package com.herbert.doorplate.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/28 14:29
 * @Description:
 */
@SpringBootApplication
//@EnableDiscoveryClient作用: 让config-server配置中心成为eureka的服务端，通过负载均衡实现高可用
//@EnableDiscoveryClient
//开启分布式配置功能
@EnableConfigServer
public class ConfigServerStart {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerStart.class, args);
    }
}
