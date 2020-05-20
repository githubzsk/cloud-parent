package com.xintong.cloudtransational.mapper;

import com.xintong.cloudtransational.entity.User2;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface User2Mapper {
    int updateUser2(User2 user2);
    User2 findUser2ById(int id);
}
