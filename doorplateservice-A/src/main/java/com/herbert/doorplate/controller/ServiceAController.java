package com.herbert.doorplate.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/31 15:50
 * @Description:
 */
@RestController
public class ServiceAController {
    @RequestMapping("/info")
    public String testA() {
        return "hello I am is service A"; //测试代码直接返回一个字符串，不再调用service层等等。
    }
}
