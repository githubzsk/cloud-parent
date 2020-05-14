package com.xintong.maintain.cloudribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class CController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/methodGet",method = RequestMethod.GET)
    public String methodGet(String name){
        return restTemplate.getForObject("http://maintain-provider/hi?name={1}",String.class,name)+" ____Ribbon";
    }
    @RequestMapping(value = "/methodPost",method = RequestMethod.POST)
    public String methodPost(String name){
     return    restTemplate.postForObject("http://maintain-provider/hello",name,String.class)+" ____Ribbon";
    }
}
