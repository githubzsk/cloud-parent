package com.xintong.cloudtransational;

import com.xintong.cloudtransational.entity.User1;
import com.xintong.cloudtransational.entity.User2;
import com.xintong.cloudtransational.mapper.User1Mapper;
import com.xintong.cloudtransational.mapper.User2Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CloudTransationalApplicationTests {

    @Autowired
    private User1Mapper user1Mapper;

    @Autowired
    private User2Mapper user2Mapper;

    @Test
    void contextLoads() {
        User1 user1 = user1Mapper.findUser1ById(1);
        user1.setName("user111");
        int i = user1Mapper.updateUser1(user1);
        System.out.println(i);
    }

//    @Test
//    void contextLoads() {
//        User2 user2 = user2Mapper.findUser2ById(1);
//        System.out.println(user2);
//        user2.setName("user2229");
//        int i = user2Mapper.updateUser2(user2);
//        System.out.println(i);
//    }

}
