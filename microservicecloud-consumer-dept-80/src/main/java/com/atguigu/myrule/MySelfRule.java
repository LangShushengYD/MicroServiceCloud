package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Cui
 * @Date: 2020/3/27
 * @Description:
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandRule_C();
    }
}
