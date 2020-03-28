package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entity.Dept;
import com.atguigu.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Cui
 * @Date: 2020/3/26
 * @Description:
 */
@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService service = null;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return service.get(id);
    }
    @RequestMapping(value = "/consumer/dept/list")
    public List list()
    {
        System.out.println(service.toString());
        return service.list();
    }
    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept)
    {
        return service.add(dept);
    }
}
