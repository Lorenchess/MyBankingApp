package com.chess4math.MyBankingApp.services;

import com.chess4math.MyBankingApp.dto.TransactionDTO;

public interface TransactionService {

    boolean autorizeTransaction(TransactionDTO transactionDTO);
}
