package com.herbert.doorplate.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/28 19:19
 * @Description:
 */
@EnableDiscoveryClient
//@SpringBootApplication
//默认会扫描main下的含有compoent service reposity中的类,所以要把他放到最外层
@SpringBootApplication(scanBasePackages = {"com.herbert.doorplate"})
public class ConfigClientStart {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientStart.class, args);
    }
}
