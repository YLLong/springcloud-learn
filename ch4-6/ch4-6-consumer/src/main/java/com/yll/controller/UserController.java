package com.yll.controller;

import com.yll.model.User;
import com.yll.service.UserService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @className: UserController
 * @description: //用户消费请求
 * @author: yys1778
 * @date: Created in 2019/2/27 17:23
 * @modify by: yys1778
 * @version: V1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/add")
    public String addUser(@RequestBody @ApiParam(name = "用户", value = "传入json格式", required = true) User user) {
        return userService.addUser(user);
    }

    @PostMapping(value = "/update")
    public String updateUser(@RequestBody @ApiParam(name = "用户", value = "传入json格式", required = true) User user) {
        return userService.updateUser(user);
    }

}
