package com.xintong.cloudtransational.service;

import com.xintong.cloudtransational.entity.User1;
import com.xintong.cloudtransational.entity.User2;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface IUser2Service {

    public void addRequired(User2 user);

    public void addRequiresNew(User2 user);

    public void addRequiredException(User2 user);
    public void addRequiresNewException(User2 user);
    public void addNested(User2 user);
    public void addNestedException(User2 user);
    public void addNever(User2 user);
}
