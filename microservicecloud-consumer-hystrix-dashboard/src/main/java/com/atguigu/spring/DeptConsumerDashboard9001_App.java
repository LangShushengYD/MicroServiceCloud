package com.atguigu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: Cui
 * @Date: 2020/3/28
 * @Description:
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerDashboard9001_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashboard9001_App.class,args);
    }
}
