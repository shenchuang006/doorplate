package com.herbert.doorplate.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/28 23:06
 * @Description:
 * 客户端调用http://localhost:8763/actuator/bus-refresh post请求刷新数据
 * headers -Content-Type:application/json格式
 */
@RefreshScope
@RestController
public class HelloBusController {

    @Value("${qx.hello}")
    String foo;

    @RequestMapping("/foo")
    public String hi(){
        return foo;
    }
}
