package com.chess4math.MyBankingApp.dto;

import com.chess4math.MyBankingApp.enums.AccountStatus;
import com.chess4math.MyBankingApp.enums.AccountType;
import com.chess4math.MyBankingApp.model.Bank;
import com.chess4math.MyBankingApp.model.Customer;
import com.chess4math.MyBankingApp.model.Transaction;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Builder
@Value
public class AccountDTO {

    Long id;

    BigDecimal balance;

    AccountType accountType;

    AccountStatus accountStatus;

    Customer customer;

    Bank bank;

    List<Transaction> transactions = new ArrayList<>();
}
