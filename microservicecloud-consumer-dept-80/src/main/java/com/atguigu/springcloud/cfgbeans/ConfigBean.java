package com.atguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Cui
 * @Date: 2020/3/26
 * @Description:
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
//        return new RandomRule();  //随机算法
        return new RetryRule();      //重新选择
//        return RoundRobinRule();  //轮询算法
//        return AvailabilityFilteringRule();//把一些服务断开的，或者连接数量超过阈值的服务过滤掉，对剩下的服务轮询
//        return WeightedResponseTimeRule();//计算每个服务访问时间的权重响应越快的服务概率越高
//        return BestAvailableRule();//过滤掉由于多次访问故障而处于断路的服务，然后选择一个最好的
//        return ZoneAvoidanceRule();//复合判断server所在区域的性能和server可用选择服务器
    }
}
