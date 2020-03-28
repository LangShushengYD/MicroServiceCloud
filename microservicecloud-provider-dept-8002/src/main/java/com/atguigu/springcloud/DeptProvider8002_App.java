package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Cui
 * @Date: 2020/3/26
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient     //作为eureka注册的客户端
@EnableDiscoveryClient //服务发现
public class DeptProvider8002_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_App.class,args);
    }
}
