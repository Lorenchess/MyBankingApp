package com.chess4math.MyBankingApp.services;

import com.chess4math.MyBankingApp.dto.AccountDTO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
public class AccountServiceImpl implements AccountService{
    @Override
    public AccountDTO createAccount(AccountDTO accountDTO) {
        return null;
    }

    @Override
    public void deposit(Long accountId, BigDecimal amount) {

    }

    @Override
    public void withdraw(Long accountId, BigDecimal amount) {

    }

    @Override
    public void transfer(Long fromAccountId, Long toAccountId, BigDecimal amount) {

    }

    @Override
    public AccountDTO getAccountById(Long accountId) {
        return null;
    }
}
