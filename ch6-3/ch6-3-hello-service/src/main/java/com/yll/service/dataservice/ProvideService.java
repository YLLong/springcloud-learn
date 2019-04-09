package com.yll.service.dataservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @className: ProvideService
 * @description: //TODO
 * @author: yys1778
 * @date: Created in 2019/4/9 16:53
 * @modify by: yys1778
 * @version: V1.0
 */
@FeignClient(name = "sc-provider-service")
public interface ProvideService {

    @GetMapping("/getDashboard")
    public List<String> getProviderData();

}
