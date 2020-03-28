package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.Dept;
import com.atguigu.springcloud.service.DeptService;
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
    private DeptService deptService;

//    @Qualifier("eurekaDiscoveryClient")
    @Autowired
    private DiscoveryClient client;

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }
    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable Long id){
        return deptService.get(id);
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list(){
        return deptService.list();
    }
    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery()
    {
        List list = client.getServices();
        System.out.println("**********" + list);
        List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }
}
