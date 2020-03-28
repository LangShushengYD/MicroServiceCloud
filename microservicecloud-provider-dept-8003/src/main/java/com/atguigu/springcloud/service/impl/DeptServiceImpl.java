package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.DeptDao;
import com.atguigu.springcloud.entity.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Cui
 * @Date: 2020/3/26
 * @Description:
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    public List list() {
        return deptDao.findAll();
    }
}
