package com.me.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.me.provider.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class TestController {

    @Reference
    private TestService testService;

    @GetMapping("/printMessage")
    public void printMessage(@RequestParam("msg") String msg) {
        testService.method_print_msg(msg);
    }

    @GetMapping("/sleepForMs")
    public void sleepForMs(@RequestParam("ms") Long ms) throws Exception {
        testService.method_sleep(ms);
    }
}
