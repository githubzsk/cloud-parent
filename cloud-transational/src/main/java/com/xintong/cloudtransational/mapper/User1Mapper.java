package com.xintong.cloudtransational.mapper;

import com.xintong.cloudtransational.entity.User1;
import com.xintong.cloudtransational.entity.User2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface User1Mapper {
    //    int updateUserName(@Param("id") int id, @Param("userName") String userName);
//    int updateUserAge(@Param("id") int id,@Param("age") int age);
    int insert(User1 record);

    User1 selectByPrimaryKey(Integer id);


}
