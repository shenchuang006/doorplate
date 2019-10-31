package com.herbert.doorplate.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/28 22:36
 * @Description:
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.herbert.doorplate"})
public class ConfigClientBusStart {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientBusStart.class, args);
    }
}
