package com.yll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EurekaClientConfigBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: QueryController
 * @description: //请求服务
 * @author: yys1778
 * @date: Created in 2018/12/21 15:13
 * @modify by: yys1778
 * @version: V1.0
 */
@RestController
@RequestMapping("/query")
public class QueryController {

    @Autowired
    EurekaClientConfigBean eurekaClientConfigBean;

    @GetMapping("/eureka-server")
    public  Object getEurekaServerUrl() {
        return eurekaClientConfigBean.getServiceUrl();
    }

}
