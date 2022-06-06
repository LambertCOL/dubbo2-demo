package com.me.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.me.provider.service.TestService;

@Service(version = "1.0.1", timeout = 3000)
public class TestServiceImpl implements TestService {
    @Override
    public void testDubbo() {
        System.out.println("print by provider");
    }
}
