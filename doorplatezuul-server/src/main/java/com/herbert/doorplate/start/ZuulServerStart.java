package com.herbert.doorplate.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/30 15:55
 * @Description:
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulServerStart {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerStart.class, args);
    }
}
