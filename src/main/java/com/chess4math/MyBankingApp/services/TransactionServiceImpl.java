package com.chess4math.MyBankingApp.services;

import com.chess4math.MyBankingApp.dto.TransactionDTO;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Override
    public boolean autorizeTransaction(TransactionDTO transactionDTO) {
        return false;
    }
}
