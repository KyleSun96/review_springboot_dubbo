package com.itheima.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.dubbo.api.HelloApi;

/**
 * @Program: Review02_springboot_dubbo
 * @ClassName: HelloService
 * @Description:
 * @Author: KyleSun
 **/
@Service
public class HelloService implements HelloApi {

    @Override
    public String sayHello(String username) {
        return "Hello Dubbo - username: " + username;
    }

}
