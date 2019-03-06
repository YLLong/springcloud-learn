package com.yll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @className: TestController
 * @description: //测试restTemplate调用
 * @author: yys1778
 * @date: Created in 2019/3/6 18:04
 * @modify by: yys1778
 * @version: V1.0
 */
@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/add")
    public String add(Integer a, Integer b) {
        String entity = restTemplate.getForObject("http://CLIENT-A/add?a=" + a + "&b=" + b, String.class);
        System.out.println(entity);
        return entity;
    }

}
