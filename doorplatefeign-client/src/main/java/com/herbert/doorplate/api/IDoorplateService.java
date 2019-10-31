package com.herbert.doorplate.api;

import com.herbert.doorplate.entity.User;
import com.herbert.doorplate.service.impl.DemoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/29 16:55
 * @Description:客户端调用时候 直接声明和提供者一样的接口
 */
@Component
@FeignClient(value = "feign-server",fallback = DemoServiceFallback.class)
public interface IDoorplateService {
    /**
     * 入参为字段，返回值为字段
     */
    @RequestMapping(value="/demo-api/test", method= RequestMethod.GET)
    String test(@RequestParam(value = "test") String test);
    /**
     * 入参为对象，返回值为对象
     */
    @RequestMapping(value="/demo-api/user", method=RequestMethod.POST)
    User user(@RequestBody User user);
}
