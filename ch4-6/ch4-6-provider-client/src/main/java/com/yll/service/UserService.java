package com.yll.service;

import com.yll.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @className: UserService
 * @description: //用户业务接口
 * @author: yys1778
 * @date: Created in 2019/2/27 16:48
 * @modify by: yys1778
 * @version: V1.0
 */
@FeignClient(name = "ch4-6-provider")
public interface UserService {

    @GetMapping(value = "/user/add")
    public String addUser(User user);

    @PostMapping(value = "/user/update")
    public String updateUser(@RequestBody User user);

}
