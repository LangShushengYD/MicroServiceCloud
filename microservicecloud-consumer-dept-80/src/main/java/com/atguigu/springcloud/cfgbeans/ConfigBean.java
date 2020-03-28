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
//        return new RandomRule();  //����㷨
        return new RetryRule();      //����ѡ��
//        return RoundRobinRule();  //��ѯ�㷨
//        return AvailabilityFilteringRule();//��һЩ����Ͽ��ģ�������������������ֵ�ķ�����˵�����ʣ�µķ�����ѯ
//        return WeightedResponseTimeRule();//����ÿ���������ʱ���Ȩ����ӦԽ��ķ������Խ��
//        return BestAvailableRule();//���˵����ڶ�η��ʹ��϶����ڶ�·�ķ���Ȼ��ѡ��һ����õ�
//        return ZoneAvoidanceRule();//�����ж�server������������ܺ�server����ѡ�������
    }
}
