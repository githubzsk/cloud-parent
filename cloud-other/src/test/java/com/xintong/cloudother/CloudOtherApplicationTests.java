package com.xintong.cloudother;

import com.xintong.cloudother.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CloudOtherApplicationTests {

    @Autowired
    private IUserService userService;

    @Test
    void contextLoads() {
        userService.sayHello();
    }

}
