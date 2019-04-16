package com.yll.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yll.service.dataservice.PSFallbackBadRequestExpcetion;
import com.yll.service.dataservice.PSFallbackOtherExpcetion;
import com.yll.service.dataservice.ProviderServiceCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: ExceptionController
 * @description: // hystrix 异常测试
 * @author: yys1778
 * @date: Created in 2019/4/11 17:30
 * @modify by: yys1778
 * @version: V1.0
 */

@RestController
@Slf4j
public class ExceptionController {

    @GetMapping("/getProviderServiceCommand")
    public String providerServiceCommand() {
        String result = new ProviderServiceCommand("World").execute();
        return result;
    }

    @GetMapping("/getPSFallbackBadRequestExpcetion")
    public String providerServiceFallback() {
        String result = new PSFallbackBadRequestExpcetion().execute();
        return result;
    }

    @GetMapping("/getPSFallbackOtherExpcetion")
    public String pSFallbackOtherExpcetion() {
        String result = new PSFallbackOtherExpcetion().execute();
        return result;
    }

    @GetMapping("/getFallbackMethodTest")
    @HystrixCommand
    public String getFallbackMethodTest(String id) {
        throw new RuntimeException("getFallbackMethodTest failed");
    }

    public String fallback(String id, Throwable throwable) {
        log.error(throwable.getMessage());
        return "this is fallback message";
    }

}
