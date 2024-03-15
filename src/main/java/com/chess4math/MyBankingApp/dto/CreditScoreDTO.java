package com.chess4math.MyBankingApp.dto;

import com.chess4math.MyBankingApp.model.Customer;
import lombok.*;


@Builder
@Value
public class CreditScoreDTO {

    Long id;

    String ssn;

    Integer score;

    Customer customer;
}
