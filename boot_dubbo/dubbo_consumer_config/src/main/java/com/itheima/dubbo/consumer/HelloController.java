package com.itheima.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.dubbo.api.HelloApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Program: Review02_springboot_dubbo
 * @ClassName: HelloController
 * @Description:
 * @Author: KyleSun
 **/
@RestController
public class HelloController {

    @Reference
    private HelloApi helloApi;

    @GetMapping("hello")
    public String sayHello(String username) {
        return helloApi.sayHello(username);
    }

    // 测试URL：http://localhost:9092/hello?username=xiaoming

}
