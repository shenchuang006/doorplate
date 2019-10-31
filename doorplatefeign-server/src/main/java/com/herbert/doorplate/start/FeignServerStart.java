package com.herbert.doorplate.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/29 16:50
 * @Description:
 */

/**
 * Spring Cloud Netflix 的微服务都是以 HTTP 接口的形式暴露的，所以可以用 Apache 的 HttpClient 或 Spring 的 RestTemplate 去調用

 而 Feign 是一個使用起來更加方便的 HTTP 客戶端，它用起來就好像調用本地方法一樣，完全感覺不到是調用的遠程方法

 总结起来就是：发布到注册中心的服务方接口，是 HTTP 的，也可以不用 Ribbon 或者 Feign，直接浏览器一样能够访问

 只不过 Ribbon 或者 Feign 调用起来要方便一些，最重要的是：它俩都支持软负载均衡

 注意：spring-cloud-starter-feign 里面已经包含了 spring-cloud-starter-ribbon（Feign 中也使用了 Ribbon）
 原文链接：https://blog.csdn.net/q_0718/article/details/80269864
 */
@SpringBootApplication(scanBasePackages = {"com.herbert.doorplate"})
@EnableDiscoveryClient
public class FeignServerStart {
    public static void main(String[] args) {
        SpringApplication.run(FeignServerStart.class, args);
    }
}
