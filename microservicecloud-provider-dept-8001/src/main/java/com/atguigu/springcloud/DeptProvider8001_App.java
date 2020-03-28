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
@EnableEurekaClient     //��Ϊeurekaע��Ŀͻ���
@EnableDiscoveryClient //������
public class DeptProvider8001_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_App.class,args);
    }
}
