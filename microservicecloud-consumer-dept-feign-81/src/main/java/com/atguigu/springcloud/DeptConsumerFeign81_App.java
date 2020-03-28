package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author: Cui
 * @Date: 2020/3/26
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.atguigu.springcloud"})
//@ComponentScan("com.atguigu.com.atguigu.springcloud")
public class DeptConsumerFeign81_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign81_App.class,args);
    }
}
