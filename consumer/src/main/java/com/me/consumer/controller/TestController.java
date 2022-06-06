package com.me.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.me.consumer.service.impl.MyTestService;
import com.me.provider.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

    @Reference(version = "1.0.1", timeout = 300)
    private TestService testService;

    @Autowired
    private MyTestService myTestService;

    @GetMapping("/greet")
    public void greet(){
        myTestService.myTestDubbo();
        testService.testDubbo();
    }
}
