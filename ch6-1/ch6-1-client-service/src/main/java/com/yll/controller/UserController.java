package com.yll.controller;

import com.yll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: UserController
 * @description: //测试熔断
 * @author: yys1778
 * @date: Created in 2019/4/4 14:36
 * @modify by: yys1778
 * @version: V1.0
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public String user(String userName) throws Exception {
        return userService.getUser(userName);
    }

}
