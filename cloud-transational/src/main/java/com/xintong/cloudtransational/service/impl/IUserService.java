package com.xintong.cloudtransational.service.impl;

public interface IUserService {
    public void notransaction_exception_required_required();
    public void notransaction_required_required_exception();
    public void transaction_required_required_exception_try();
    public void transaction_exception_required_requiresNew_requiresNew();
    public void transaction_required_requiresNew_requiresNew_exception();
    public void transaction_required_requiresNew_requiresNew_exception_try();
    public void notransaction_exception_nested_nested();
    public void notransaction_nested_nested_exception();
    public void transaction_nested_nested_exception_try();
    public void transaction_exception_nested_nested();
    public void transaction_nested_nested_exception();
    public void transaction_never();
}
