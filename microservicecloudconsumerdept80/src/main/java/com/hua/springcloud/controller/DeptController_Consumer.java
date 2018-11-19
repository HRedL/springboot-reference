package com.hua.springcloud.controller;

import com.hua.springcloud.entites.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author lenovo
 * @Version 2018/11/1
 */
@RestController
public class DeptController_Consumer {

    private static final String REST_URL_PREFIX="http://localhost:8001";

    /**
     * RestTemplate是个什么呢？
     * 它就是如果你要对于那个请求的封装，给你弄一个模板任你使用
     * 如何使用呢？
     * (url,requestMap,ResponseBean.class)
     * 这三个参数分别代表REST请求地址、请求参数、HTTP响应转换被转换成的对象类型
     */
    @Autowired
    private RestTemplate template;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){
        return template.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping(value="/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id){
        return template.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return template.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }

}


