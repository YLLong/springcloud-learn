package com.yll.service.dataservice;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

/**
 * @className: PSFallbackOtherExpcetion
 * @description: //TODO
 * @author: yys1778
 * @date: Created in 2019/4/16 16:31
 * @modify by: yys1778
 * @version: V1.0
 */
public class PSFallbackOtherExpcetion extends HystrixCommand<String> {

    public PSFallbackOtherExpcetion() {
        super(HystrixCommandGroupKey.Factory.asKey("GroupOE"));
    }

    @Override
    protected String run() throws Exception {
        throw  new Exception("this command will trigger fallback");
    }

    @Override
    protected String getFallback() {
        return "invoke PSFallbackOtherExpcetion fallback method";
    }

}
