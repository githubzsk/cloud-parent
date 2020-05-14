package com.xintong.maintain.cloudfeignconsumer.controller;


import com.xintong.maintain.cloudfeignconsumer.service.IUSerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CController {

    @Autowired
    private IUSerService userSerService;


    @RequestMapping(value = "/methodGet",method = RequestMethod.GET)
    public String methodGet(String name){
        return userSerService.getHi(name)+" ____Feign";
    }
    @RequestMapping(value = "/methodPost",method = RequestMethod.POST)
    public String methodPost(String name){
        return  userSerService.getHello(name)+" ____Feign";
    }
}
