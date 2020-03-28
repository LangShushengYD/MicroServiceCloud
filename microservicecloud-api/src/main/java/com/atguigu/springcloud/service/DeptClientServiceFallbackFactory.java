package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: Cui
 * @Date: 2020/3/27
 * @Description:
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>
{
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(long id) {
                return new Dept().setDeptNo(id)
                        .setDName("该ID："+id+"没有没有对应的信息,null--@HystrixCommand")
                        .setDb_source("no this database in MySQL");
            }

            @Override
            public List list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
