package com.xintong.maintain.cloudfeignconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "maintain-provider",fallback = UserServiceHystrix.class)
public interface IUSerService {

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String getHi(@RequestParam("name") String name);
    @PostMapping("hello")
    public String getHello(@RequestBody String name);
}
