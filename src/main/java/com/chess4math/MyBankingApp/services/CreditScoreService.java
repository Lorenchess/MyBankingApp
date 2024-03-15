package com.chess4math.MyBankingApp.services;

import com.chess4math.MyBankingApp.dto.CustomerDTO;

public interface CreditScoreService {

    boolean checkCreditScore(CustomerDTO customerDTO);
}
