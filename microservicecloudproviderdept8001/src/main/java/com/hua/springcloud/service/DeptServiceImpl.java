package com.hua.springcloud.service;

import com.hua.springcloud.dao.DeptDao;
import com.hua.springcloud.entites.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author lenovo
 * @Version 2018/11/1
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao dao;

    /*
     * 可以发现下面方法和dao层都差不多，而名字却差很多
     * 这是因为这样命名更符合controller里面的rest风格的业务逻辑
     */

    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }
}
