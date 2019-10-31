package com.herbert.doorplate.bean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/31 15:27
 * @Description:
 */
@Configuration
public class BeanFactory {
    @LoadBalanced //开启负载均衡客户端
    @Bean //注册一个具有容错功能的RestTemplate
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
