package com.hua.springcloud.controller;

/**
 * @Author lenovo
 * @Version 2018/11/1
 */

import com.hua.springcloud.entites.Dept;
import com.hua.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 因为前后端分离，我们只提供rest风格的接口，所以说返回到界面上的就是一个json
 * 字符串，所以说，我们可以在这直接加上@RestController注解或者在每个方法里面
 * 都加上@Responsebody
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    /**
     * 注意，所谓的rest风格，深度的不懂，简单的就是add对应post
     * get就是 get
     * update就是put
     * delete就是delete
     * 然后对哪一种资源进行操作就是    /资源/add等
     * 还有
     * 下面这个@RequestMapping注解也可以直接写成@PostMapping
     */
    @RequestMapping(value="/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return service.add(dept);
    }

    @RequestMapping(value="/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id")Long id){
        return service.get(id);
    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return service.list();
    }

}
