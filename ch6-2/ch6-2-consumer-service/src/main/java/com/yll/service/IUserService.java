package com.yll.service;

import com.yll.service.impl.UserServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @className: IUserService
 * @description: //TODO
 * @author: yys1778
 * @date: Created in 2019/4/8 17:22
 * @modify by: yys1778
 * @version: V1.0
 */
@FeignClient(name = "sc-provider-service", fallback = UserServiceFallBack.class)
public interface IUserService {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUser(String userName);

}
