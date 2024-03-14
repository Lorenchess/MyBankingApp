package com.chess4math.MyBankingApp.dto;

import com.chess4math.MyBankingApp.model.Account;
import com.chess4math.MyBankingApp.model.Bank;
import lombok.*;


@Builder
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {


    Long id;

    private String name;

    private Long phoneNumber;

    private String emailAddress;

    private String address;

    private String ssn;

    private Bank bank;

    private Account account;
}
