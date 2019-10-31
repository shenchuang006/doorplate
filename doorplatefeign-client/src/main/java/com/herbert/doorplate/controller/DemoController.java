package com.herbert.doorplate.controller;

import com.herbert.doorplate.api.IDoorplateService;
import com.herbert.doorplate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/29 19:32
 * @Description:
 */

@RestController
public class DemoController {
    @Autowired(required = false)
    public IDoorplateService doorplateService;

    @RequestMapping("/test")
    public String test() {
        return doorplateService.test("test");
    }

    @RequestMapping("/user")
    public User user() {
        User user = new User();
        user.setAge(10);
        user.setName("Joab-Y");
        System.err.println(user);
        return doorplateService.user(user);
    }
}
