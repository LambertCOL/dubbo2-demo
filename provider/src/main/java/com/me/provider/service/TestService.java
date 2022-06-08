package com.me.provider.service;

public interface TestService {

    /**
     * 仅打印文本
     */
    void method_print_msg(String msg);

    /**
     * 停留
     */
    void method_sleep(long ms) throws Exception;
}
