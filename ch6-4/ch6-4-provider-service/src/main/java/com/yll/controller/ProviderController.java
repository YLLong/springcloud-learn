package com.yll.controller;

import com.yll.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: ProviderController
 * @description: // 用户请求处理类
 * @author: yys1778
 * @date: Created in 2019/4/17 9:14
 * @modify by: yys1778
 * @version: V1.0
 */
@RestController
public class ProviderController {

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        System.out.println("ProviderController, id is" + id);
        if (id == 1) {
            return  new User("Toy", "123456", 45);
        } else if (id == 2) {
            return new User("zhangsan", "123", 23);
        }
        return new User("lisi", "1234", 12);
    }

}
