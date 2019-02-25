package com.yll.controller;

import com.yll.model.User;
import com.yll.service.UserFeignService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @className: UserController
 * @description: //用户请求controller
 * @author: yys1778
 * @date: Created in 2019/2/25 17:50
 * @modify by: yys1778
 * @version: V1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserFeignService userFeignService;

    @PostMapping("/add")
    public String addUser(@RequestBody @ApiParam(name = "用户", value = "传入json格式", required = true)User user) {
        return userFeignService.addUser(user);
    }

    @PostMapping("/update")
    public String updateUser(@RequestBody @ApiParam(name = "用户", value = "传入json格式", required = true)User user) {
        return userFeignService.updateUser(user);
    }

}
