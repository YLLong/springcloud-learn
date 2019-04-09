package com.yll.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: TestController
 * @description: //被 feign 客户端调用请求接口
 * @author: yys1778
 * @date: Created in 2019/4/9 16:12
 * @modify by: yys1778
 * @version: V1.0
 */
@RestController
public class TestController {

    @GetMapping("/getDashboard")
    public List<String> getProviderData() {
        List<String> provider = new ArrayList<String>();
        provider.add("hystrix dashboard");
        return provider;
    }

}
