package com.itheima.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.dubbo.api.HelloApi;

@Service
public class HelloService implements HelloApi {

    @Override
    public String sayHello(String username) {

        System.out.println("HelloService is called....");

        // 超时时长测试
      /*  try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        return "Hello Dubbo - username: " + username;
    }
}
