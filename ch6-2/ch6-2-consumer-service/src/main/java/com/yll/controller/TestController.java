package com.yll.controller;

import com.yll.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: TestController
 * @description: //TODO
 * @author: yys1778
 * @date: Created in 2019/4/8 17:21
 * @modify by: yys1778
 * @version: V1.0
 */
@RestController
public class TestController {

    @Autowired
    IUserService userService;

    @GetMapping("/user")
    public String getUser(@RequestParam("userName") String userName) throws Exception {
        return userService.getUser(userName);
    }


}
