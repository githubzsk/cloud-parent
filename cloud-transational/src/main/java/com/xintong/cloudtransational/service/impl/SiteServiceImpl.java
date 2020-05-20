package com.xintong.cloudtransational.service.impl;

import com.xintong.cloudtransational.service.ISiteService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class SiteServiceImpl implements ISiteService {


    @Override
    public void methodA() {

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void methodB() {

    }
}
