package com.yll.service.dataservice;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.exception.HystrixBadRequestException;
import lombok.extern.slf4j.Slf4j;

/**
 * @className: PSFallbackBadRequestExpcetion
 * @description: //TODO
 * @author: yys1778
 * @date: Created in 2019/4/16 16:25
 * @modify by: yys1778
 * @version: V1.0
 */
@Slf4j
public class PSFallbackBadRequestExpcetion extends HystrixCommand<String> {

    public PSFallbackBadRequestExpcetion() {
        super(HystrixCommandGroupKey.Factory.asKey("GroupBRE"));
    }

    @Override
    protected String run() throws Exception {
        throw  new HystrixBadRequestException("PSFallbackBadRequestExpcetion error");
    }

    @Override
    protected String getFallback() {
        System.out.println(getFailedExecutionException().getMessage());
        return "invoke HystrixBadRequestException fallback method:  ";
    }
}
