package com.xintong.maintain.cloudprovider.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class UserController {

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String getHi(String name){
        try {
            Thread.sleep(new Random().nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hi "+name+", This is GET _provider3";
    }

    @RequestMapping(value = "hello",method = RequestMethod.POST)
    public String getHello(@RequestBody String name){
        return "Hello "+name+", This is POST _provider3";
    }

}
