package com.yll.service;

/**
 * @className: UserService
 * @description: //获取人员信息接口
 * @author: yys1778
 * @date: Created in 2019/4/4 14:40
 * @modify by: yys1778
 * @version: V1.0
 */
public interface UserService {
    /**
     * @title: getUser
     * @description: //验证用户名是否正确
     * @author: yys1778
     * @date: Created in 2019/4/4 14:42
     * @param userName
     * @throws:
     * @return: java.lang.String
     */
    String getUser(String userName) throws Exception;
}
