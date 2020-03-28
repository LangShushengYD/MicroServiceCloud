package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Cui
 * @Date: 2020/3/28
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class ConfigEureka_7001_App {
    public static void main(String[] args) {
        SpringApplication.run(ConfigEureka_7001_App.class,args);
    }
}
