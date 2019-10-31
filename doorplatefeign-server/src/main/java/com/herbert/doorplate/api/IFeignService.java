package com.herbert.doorplate.api;

import com.herbert.doorplate.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/30 16:10
 * @Description:
 */
public interface IFeignService {
    @RequestMapping(value="/simple/{id}",method= RequestMethod.GET)
    public User getUserById(@PathVariable("id") Long id);
}
