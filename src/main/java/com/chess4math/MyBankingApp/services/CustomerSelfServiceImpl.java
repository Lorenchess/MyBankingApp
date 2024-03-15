package com.chess4math.MyBankingApp.services;

import com.chess4math.MyBankingApp.dto.AccountDTO;
import com.chess4math.MyBankingApp.dto.CustomerDTO;
import org.springframework.stereotype.Service;

@Service
public class CustomerSelfServiceImpl implements CustomerSelfService {
    @Override
    public CustomerDTO registerCustomer(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public CustomerDTO updateCustomerProfile(Long customerId, CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public CustomerDTO getCustomerProfile(Long customerId) {
        return null;
    }

    @Override
    public void deactivateCustomerAccount(Long customerId) {

    }

    @Override
    public AccountDTO createCustomerAccount(AccountDTO accountDTO) {
        return null;
    }
}
