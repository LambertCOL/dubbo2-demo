package com.me.consumer.service.impl.impl;


import com.me.consumer.service.impl.MyTestService;
import org.springframework.stereotype.Service;

@Service
public class MyTestServiceImpl implements MyTestService {

    @Override
    public void myTestDubbo() {
        System.out.println("print by consumer");
    }

}
