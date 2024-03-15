package com.chess4math.MyBankingApp.services;

import com.chess4math.MyBankingApp.dto.AccountDTO;
import com.chess4math.MyBankingApp.model.Account;

import java.math.BigDecimal;

public interface AccountService {

    AccountDTO createAccount(AccountDTO accountDTO);
    void deposit(Long accountId, BigDecimal amount);

    void withdraw(Long accountId, BigDecimal amount);

    void transfer(Long fromAccountId, Long toAccountId, BigDecimal amount);

    AccountDTO getAccountById(Long accountId);

}
