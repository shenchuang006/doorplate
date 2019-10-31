package com.herbert.doorplate.controller;

import com.herbert.doorplate.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/31 15:35
 * @Description:
 */
@RestController
public class CustomerABController {

    @Autowired
    private HelloService service;

    @RequestMapping("/ribbon-consumer")
    public String coutomerAB() {
        return service.helloService();
    }
}

