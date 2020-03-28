package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entity.Dept;

import java.util.List;

public interface DeptService {
    boolean add(Dept dept);
    Dept get(Long id);
    List list();
}
