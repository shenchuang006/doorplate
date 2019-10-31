package com.herbert.doorplate.controller;

import com.herbert.doorplate.api.IFeignService;
import com.herbert.doorplate.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/30 16:11
 * @Description:
 */
@RestController
public class FeignServerController {
    private Logger log = LoggerFactory.getLogger(FeignServerController.class);

    @RequestMapping(value="/simple/{id}",method= RequestMethod.GET)
    public User findById(@PathVariable("id") Long id){
        User user = new User(10,"Jerry");
        return user;
    }
}
