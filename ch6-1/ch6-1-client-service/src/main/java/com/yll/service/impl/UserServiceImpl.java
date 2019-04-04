package com.yll.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yll.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @className: UserServiceImpl
 * @description: //TODO
 * @author: yys1778
 * @date: Created in 2019/4/4 14:40
 * @modify by: yys1778
 * @version: V1.0
 */
@Service
public class UserServiceImpl implements UserService {
    /**
     * @param userName
     * @title: getUser
     * @description: //验证用户名是否正确
     * @author: yys1778
     * @date: Created in 2019/4/4 14:42
     * @throws:
     * @return: java.lang.String
     */
    @Override
    @HystrixCommand(fallbackMethod = "defaultUser")
    public String getUser(String userName) throws Exception {
        if ("admin".equals(userName)) {
            return userName + " 这个用户存在！";
        } else {
            throw  new Exception();
        }
    }

    public String defaultUser(String userName) {
        return userName + " 这个用户不存在系统中！";
    }
}
