package com.chess4math.MyBankingApp.dto;

import com.chess4math.MyBankingApp.model.Account;
import com.chess4math.MyBankingApp.model.Bank;
import com.chess4math.MyBankingApp.model.CreditScore;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


@Builder(toBuilder = true)
@Value
public class CustomerDTO {

    Long id;

    String name;

    String phoneNumber;

    String emailAddress;

    String address;

    String ssn;

    Bank bank;

    Set<Account> accounts = new HashSet<>();

    CreditScore creditScore;
}
