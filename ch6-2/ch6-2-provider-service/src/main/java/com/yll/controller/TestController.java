package com.yll.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: TestController
 * @description: //测试请求类
 * @author: yys1778
 * @date: Created in 2019/4/8 17:01
 * @modify by: yys1778
 * @version: V1.0
 */
@RestController
public class TestController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUser(@RequestParam("userName") String userName) {
        return userName + "This is real user";
    }

}
