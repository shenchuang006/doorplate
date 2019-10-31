package com.herbert.doorplate.service.impl;

//import com.herbert.doorplate.api.IFeignService;
import com.herbert.doorplate.api.IDoorplateService;
import com.herbert.doorplate.entity.User;
import org.springframework.stereotype.Component;

/**
 * @Auther: shenchuang
 * @Date: 2019/10/29 19:29
 * @Description:熔断,如果服务端报错就直接响应
 */
@Component
public class DemoServiceFallback  implements IDoorplateService{

    public String test(String test) {
        return "error";
    }


    public User user(User user) {
        return null;
    }
}
