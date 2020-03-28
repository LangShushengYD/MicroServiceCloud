package com.atguigu.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: Cui
 * @Date: 2020/3/25
 * @Description:
 */
//@AllArgsConstructor
@NoArgsConstructor
@Data
//@Accessors(chain = true,fluent = true,prefix = "d")
@Accessors(chain = true)
public class Dept implements Serializable {
    private long deptNo;
    private String dName;
    private String db_source;

    public Dept(String dName) {
        this.dName = dName;
    }
}
