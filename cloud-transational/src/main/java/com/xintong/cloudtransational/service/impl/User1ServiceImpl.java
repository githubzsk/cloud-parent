package com.xintong.cloudtransational.service.impl;

import com.xintong.cloudtransational.entity.User1;
import com.xintong.cloudtransational.entity.User2;
import com.xintong.cloudtransational.mapper.User1Mapper;
import com.xintong.cloudtransational.service.IUser1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class User1ServiceImpl implements IUser1Service {

    @Autowired
    private User1Mapper user1Mapper;


    //省略其他...
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addRequired(User1 user){
        user1Mapper.insert(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addRequiresNew(User1 user){
        user1Mapper.insert(user);
    }

    @Override
    @Transactional(propagation = Propagation.NESTED)
    public void addNested(User1 user){
        user1Mapper.insert(user);
    }

}
