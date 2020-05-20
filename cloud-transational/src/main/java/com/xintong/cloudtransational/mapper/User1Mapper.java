package com.xintong.cloudtransational.mapper;

import com.xintong.cloudtransational.entity.User1;
import com.xintong.cloudtransational.entity.User2;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface User1Mapper {
    int updateUser1(User1 user1);
    User1 findUser1ById(int id);
}
