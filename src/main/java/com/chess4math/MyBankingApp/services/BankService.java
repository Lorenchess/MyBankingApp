package com.chess4math.MyBankingApp.services;

import com.chess4math.MyBankingApp.dto.BankDTO;
import com.chess4math.MyBankingApp.dto.CustomerDTO;
import com.chess4math.MyBankingApp.dto.TransactionDTO;

import java.awt.print.Pageable;
import java.util.List;

public interface BankService {

    boolean performTransaction(TransactionDTO transactionDTO);

    List<CustomerDTO> getAllCustomers(Long bankId, Pageable pageable);

    BankDTO getBankDetails(Long bankId);


}
