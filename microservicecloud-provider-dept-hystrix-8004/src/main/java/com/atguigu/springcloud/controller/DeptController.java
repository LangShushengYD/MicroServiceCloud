package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.Dept;
import com.atguigu.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Cui
 * @Date: 2020/3/26
 * @Description:
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService service = null;
    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id)
    {
        Dept dept =  this.service.get(id);
        if(null == dept)
        {
            throw new RuntimeException("��ID��"+id+"û��û�ж�Ӧ����Ϣ");
        }
        return dept;
    }
    public Dept processHystrix_Get(@PathVariable("id") Long id)
    {
        return new Dept().setDeptNo(id)
                .setDName("��ID��"+id+"û��û�ж�Ӧ����Ϣ,null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }
}
