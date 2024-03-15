package com.chess4math.MyBankingApp.dto;

import com.chess4math.MyBankingApp.model.Customer;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


@Builder
@Value
public class BankDTO {

    Long id;

    String name;

    String phoneNumber;

    String emailAddress;

    String routingNumber;

    Set<Customer> customers = new HashSet<>();


}
