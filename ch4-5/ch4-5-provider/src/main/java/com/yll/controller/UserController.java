package com.yll.controller;

import com.yll.model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

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


    @GetMapping("/add")
    public String addUser(User user, HttpServletRequest request) {
        String token = request.getHeader("oauthToken");
        return "hello, " + user.getName();
    }

    @PostMapping("/update")
    public String updateUser(@RequestBody User user) {
        return "hello, " + user.getName();
    }

}
