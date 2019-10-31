package com.herbert.doorplate.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/31 15:22
 * @Description:
 */
@SpringBootApplication(scanBasePackages = {"com.herbert.doorplate"})
@EnableEurekaClient
public class DoorplateServiceBStart {
    public static void main(String[] args) {
        SpringApplication.run(DoorplateServiceBStart.class, args);
    }
}
