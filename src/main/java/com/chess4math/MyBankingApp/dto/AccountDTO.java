package com.chess4math.MyBankingApp.dto;

import com.chess4math.MyBankingApp.model.Bank;
import com.chess4math.MyBankingApp.model.Customer;
import lombok.*;

import java.math.BigDecimal;


@Builder
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {

    Long id;

    private BigDecimal balance;

    private Customer customer;

    private Bank bank;
}
