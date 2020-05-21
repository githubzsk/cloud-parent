package com.xintong.cloudtransational;

import com.xintong.cloudtransational.entity.User1;
import com.xintong.cloudtransational.entity.User2;
import com.xintong.cloudtransational.mapper.User1Mapper;
import com.xintong.cloudtransational.mapper.User2Mapper;
import com.xintong.cloudtransational.service.impl.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CloudTransationalApplicationTests {

    @Autowired
    private IUserService userService;

//    @Test
//    void contextLoads() {
//        userService.notransaction_exception_required_required();
//    }

    @Test
    void contextLoads() {
        userService.transaction_never();
    }

//    @Test
//    void contextLoads() {
//        userService.transaction_required_required_exception_try();
//    }

}
