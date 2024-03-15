package com.chess4math.MyBankingApp.services;

import com.chess4math.MyBankingApp.dto.CustomerDTO;
import org.springframework.stereotype.Service;

@Service
public class CreditScoreServiceImpl implements CreditScoreService{
    @Override
    public boolean checkCreditScore(CustomerDTO customerDTO) {
        return false;
    }
}
