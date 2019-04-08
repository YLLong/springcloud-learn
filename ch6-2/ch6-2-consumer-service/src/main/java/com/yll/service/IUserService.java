package com.yll.service;

import com.yll.service.impl.UserServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @className: IUserService
 * @description: //feign 客户端调用服务
 * @author: yys1778
 * @date: Created in 2019/4/8 17:22
 * @modify by: yys1778
 * @version: V1.0
 */
@FeignClient(name = "sc-provider-service", fallback = UserServiceFallBack.class)
public interface IUserService {

    /**
     * @title: getUser
     * @description: // get 请求 @requestParam 注解不能少
     * @author: yys1778
     * @date: Created in 2019/4/9 7:45
     * @param userName
     * @throws:
     * @return: java.lang.String
     */
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUser(@RequestParam("userName") String userName);

}
