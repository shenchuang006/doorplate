package com.herbert.doorplate.start;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/31 15:53
 * @Description:
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/31 15:22
 * @Description:
 */
@SpringBootApplication(scanBasePackages = {"com.herbert.doorplate"})
@EnableEurekaClient
@EnableCircuitBreaker
public class DoorplateConsumerABStart {
    public static void main(String[] args) {
        SpringApplication.run(DoorplateConsumerABStart.class, args);
    }
}
