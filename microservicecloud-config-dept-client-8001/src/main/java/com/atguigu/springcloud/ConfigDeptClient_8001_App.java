package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Cui
 * @Date: 2020/3/28
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ConfigDeptClient_8001_App {
    public static void main(String[] args) {
        SpringApplication.run(ConfigDeptClient_8001_App.class,args);
    }
}
