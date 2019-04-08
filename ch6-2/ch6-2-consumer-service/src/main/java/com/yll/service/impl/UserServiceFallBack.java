package com.yll.service.impl;

import com.yll.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @className: UserServiceFallBack
 * @description: //TODO
 * @author: yys1778
 * @date: Created in 2019/4/8 17:25
 * @modify by: yys1778
 * @version: V1.0
 */
@Service
public class UserServiceFallBack implements IUserService {

    /**
     * @title: getUser
     * @description: //出错则调用该方法返回友好错误
     * @author: yys1778
     * @date: Created in 2019/4/8 17:27
     * @param userName
     * @throws:
     * @return: java.lang.String
     */
    @Override
    public String getUser(String userName) {
        return "The user does not exist in this system, please confirm username";
    }

}
