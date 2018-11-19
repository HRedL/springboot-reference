package com.hua.springcloud.service;

import com.hua.springcloud.entites.Dept;

import java.util.List;

/**
 * @Author lenovo
 * @Version 2018/10/31
 */
public interface DeptService {

    public boolean add(Dept dept);


    public Dept get(Long id);

    public List<Dept> list();

}
