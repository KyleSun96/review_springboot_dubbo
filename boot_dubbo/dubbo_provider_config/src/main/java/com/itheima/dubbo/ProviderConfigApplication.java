package com.itheima.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Program: Review02_springboot_dubbo
 * @ClassName: ProviderXMLApplication
 * @Description:
 * @Author: KyleSun
 **/
@SpringBootApplication
@EnableDubbo   // 开启dubbo支持
public class ProviderConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderConfigApplication.class, args);
    }

}
