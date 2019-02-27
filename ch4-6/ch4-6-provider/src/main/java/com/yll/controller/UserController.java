package com.yll.controller;

import com.yll.model.User;
import com.yll.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: UserController
 * @description: //user请求
 * @author: yys1778
 * @date: Created in 2019/2/27 17:13
 * @modify by: yys1778
 * @version: V1.0
 */
@RestController
public class UserController implements UserService {
    @Override
    public String addUser(User user) {
        return "hello, " + user.getName();
    }

    /**
     * @RequestBody 不要忘记写
     * @param user
     * @return
     */
    @Override
    public String updateUser(@RequestBody User user) {
        return "hello, " + user.getName();
    }

}
