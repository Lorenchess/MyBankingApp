package com.chess4math.MyBankingApp.dto;

import com.chess4math.MyBankingApp.model.Customer;
import lombok.*;

import java.util.Set;


@Builder
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class BankDTO {

    Long id;

    private String name;

    private Long phoneNumber;

    private String emailAddress;

    private Long routingNumber;

    private Set<Customer> customers;


}
