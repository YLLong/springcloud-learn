package com.yll.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @className: TestController
 * @description: //测试类
 * @author: yys1778
 * @date: Created in 2019/3/6 17:53
 * @modify by: yys1778
 * @version: V1.0
 */
@RestController
public class TestController {

    @GetMapping("/add")
    public String add(Integer a, Integer b, HttpServletRequest request) {
        return " From port: " + request.getServerPort() + ", Result: " + (a + b);
    }

}
