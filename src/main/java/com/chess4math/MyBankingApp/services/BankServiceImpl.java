package com.chess4math.MyBankingApp.services;

import com.chess4math.MyBankingApp.dto.BankDTO;
import com.chess4math.MyBankingApp.dto.CustomerDTO;
import com.chess4math.MyBankingApp.dto.TransactionDTO;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class BankServiceImpl implements BankService{

    @Override
    public boolean performTransaction(TransactionDTO transactionDTO) {
        return false;
    }

    @Override
    public List<CustomerDTO> getAllCustomers(Long bankId, Pageable pageable) {
        return null;
    }

    @Override
    public BankDTO getBankDetails(Long bankId) {
        return null;
    }
}
