package com.vanhan_spring.accounts.service;

import com.vanhan_spring.accounts.dto.CustomerDto;

public interface IAcountsService {

    void  createAccount(CustomerDto customerDto);
    CustomerDto fetchAccount(String mobileNumber);
    boolean updateAccount(CustomerDto customerDto);
    boolean deleteAccount(String mobileNumber);
}
