package com.itheima.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Program: Review02_springboot_dubbo
 * @ClassName: ConsumerXMLApplication
 * @Description:
 * @Author: KyleSun
 **/
@SpringBootApplication
@EnableDubbo
@ImportResource(locations = "classpath:consumer.xml")   // 导入xml 配置文件
public class ConsumerXMLApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerXMLApplication.class, args);
    }

}
