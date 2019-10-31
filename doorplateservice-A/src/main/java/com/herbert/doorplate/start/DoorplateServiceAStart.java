package com.herbert.doorplate.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/30 23:55
 * @Description:
 */
@SpringBootApplication(scanBasePackages = {"com.herbert.doorplate"})
@EnableEurekaClient
public class DoorplateServiceAStart {
    public static void main(String[] args) {
        SpringApplication.run(DoorplateServiceAStart.class, args);
    }
}
