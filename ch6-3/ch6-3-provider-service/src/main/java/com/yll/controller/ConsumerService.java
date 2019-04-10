package com.yll.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @className: ConsumerService
 * @description: // 调用 helloService 接口
 * @author: yys1778
 * @date: Created in 2019/4/10 14:50
 * @modify by: yys1778
 * @version: V1.0
 */
@FeignClient(name = "sc-hello-service")
public interface ConsumerService {

    @GetMapping("/helloService")
    public String getHelloServiceData();

}
