package com.herbert.doorplate.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/29 19:34
 * @Description:
 */
@SpringBootApplication(scanBasePackages = {"com.herbert.doorplate"})
@EnableDiscoveryClient
@EnableFeignClients(basePackages= {"com.herbert.doorplate.api"})
public class FeignClientStart {
    public static void main(String[] args) {
        SpringApplication.run(FeignClientStart.class, args);
    }
}
