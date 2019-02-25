package com.yll.service;

import com.yll.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @className: UserFeignService
 * @description: //用户业务处理service
 * @author: yys1778
 * @date: Created in 2019/2/25 17:57
 * @modify by: yys1778
 * @version: V1.0
 */
@FeignClient(name = "ch4-5-provider")
public interface UserFeignService {

    @GetMapping(value = "/user/add")
    public String addUser(User user);

    @PostMapping(value = "/user/update")
    public String updateUser(@RequestBody User user);

}
