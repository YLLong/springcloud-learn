package com.yll.controller;

import com.yll.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @className: TestController
 * @description: //测试类
 * @author: yys1778
 * @date: Created in 2019/4/9 16:34
 * @modify by: yys1778
 * @version: V1.0
 */
@RestController
public class TestController {

    @Autowired
    IUserService userService;

    @GetMapping("/getProviderData")
    public List<String> getProviderData() {
        return userService.getProviderData();
    }

}
