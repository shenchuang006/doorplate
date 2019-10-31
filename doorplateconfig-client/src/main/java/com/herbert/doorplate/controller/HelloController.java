package com.herbert.doorplate.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/28 19:28
 * @Description:
 */
@RestController
@RefreshScope//开启更新功能
public class HelloController {

    @Value("${qx.hello}")
    private String gitConfigName;

    @GetMapping("/hello")
    public String fromGitHubServer(){
        return gitConfigName;
    }
}

