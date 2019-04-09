package com.yll.service.impl;

import com.yll.service.IUserService;
import com.yll.service.dataservice.ProvideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className: UserService
 * @description: //TODO
 * @author: yys1778
 * @date: Created in 2019/4/9 16:52
 * @modify by: yys1778
 * @version: V1.0
 */
@Service
public class UserService implements IUserService {

    @Autowired
    ProvideService dataService;

    @Override
    public List<String> getProviderData() {
        return dataService.getProviderData();
    }
}
