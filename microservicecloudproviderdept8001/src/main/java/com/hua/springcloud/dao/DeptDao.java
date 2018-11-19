package com.hua.springcloud.dao;

import com.hua.springcloud.entites.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author lenovo
 * @Version 2018/10/31
 */
//注意springboot整合需要加这个注解，不要忘记
@Mapper
public interface DeptDao {

    //添加部门信息
    public boolean addDept(Dept dept);

    //根据部门id查找部门信息
    public Dept findById(Long id);

    //查询出所有部门信息
    public List<Dept> findAll();


}
