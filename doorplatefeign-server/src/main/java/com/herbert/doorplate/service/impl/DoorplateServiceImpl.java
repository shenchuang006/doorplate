package com.herbert.doorplate.service.impl;

import com.herbert.doorplate.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.herbert.doorplate.api.IDoorplateService;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/29 17:03
 * @Description:提供者如果是特殊对象 controller必须加上注解 比如@RequestBody
 */
@RestController
public class DoorplateServiceImpl implements IDoorplateService{
    @Override
    public String test(@RequestParam(value = "test")String test) {
        return "test: " + test;
    }

    @Override
    public User user(@RequestBody User user) {
        if (user == null) {
            user = new User(10, "Joab-Y");
        }
        System.err.println(user);
        return user;
    }
}
