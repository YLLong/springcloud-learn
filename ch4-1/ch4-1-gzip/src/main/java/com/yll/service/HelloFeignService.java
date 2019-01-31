package com.yll.service;

import com.yll.config.HelloFeignServiceConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @className: HelloFeignService
 * @description: //配置feign
 * @author: yys1778
 * @date: Created in 2019/1/31 14:09
 * @modify by: yys1778
 * @version: V1.0
 */
@FeignClient(name = "github-client", url = "https://api.github.com", configuration = HelloFeignServiceConfig.class)
public interface HelloFeignService {

    @RequestMapping(value = "/search/repositories", method = RequestMethod.GET)
    ResponseEntity<byte[]> searchRepo(@RequestParam("q") String queryStr);

}
