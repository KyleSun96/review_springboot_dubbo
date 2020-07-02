package com.itheima.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Program: Review02_springboot_dubbo
 * @ClassName: ConsumerConfigApplication
 * @Description:
 * @Author: KyleSun
 **/
@SpringBootApplication
@EnableDubbo
public class ConsumerConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerConfigApplication.class, args);
    }

}
