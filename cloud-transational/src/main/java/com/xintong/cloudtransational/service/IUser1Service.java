package com.xintong.cloudtransational.service;

import com.xintong.cloudtransational.entity.User1;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface IUser1Service {
//    int updateUserName(int id,String userName);
//    int updateUserAge(int id,int age);
//    User1 findUser1ById(int id);


    public void addRequired(User1 user);
    public void addRequiresNew(User1 user);
    public void addNested(User1 user);

}
