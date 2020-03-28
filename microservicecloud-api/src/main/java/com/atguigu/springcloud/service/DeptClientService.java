package com.atguigu.springcloud.service;
import java.util.List;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.atguigu.springcloud.entity.Dept;
//@FeignClient(value = "MICROSERVICECLOUD-DEPT")
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    Dept get(@PathVariable("id") long id);
    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    List list();
    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    boolean add(Dept dept);
}