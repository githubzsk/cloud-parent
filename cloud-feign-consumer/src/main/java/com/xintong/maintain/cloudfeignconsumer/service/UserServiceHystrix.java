package com.xintong.maintain.cloudfeignconsumer.service;

import org.springframework.stereotype.Component;

@Component
public class UserServiceHystrix implements IUSerService {
    @Override
    public String getHi(String name) {
        return "get Hi Error";
    }

    @Override
    public String getHello(String name) {
        return "get Hello Error";
    }
}
