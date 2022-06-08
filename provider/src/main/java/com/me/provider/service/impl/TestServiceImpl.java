package com.me.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.me.provider.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class TestServiceImpl implements TestService {

    private final Logger log = LoggerFactory.getLogger(TestServiceImpl.class);

    @Override
    public void method_print_msg(String msg) {
        log.info("print by method_print_msg, param: msg:"+msg);
        System.out.println(msg);
    }

    @Override
    public void method_sleep(long ms) throws InterruptedException {
        log.info("print by method_sleep start, param: [ms:" + ms+"]");
        Thread.sleep(ms);
        log.info("print by method_sleep end");
    }
}
