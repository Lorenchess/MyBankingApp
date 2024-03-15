package com.chess4math.MyBankingApp.dto;

import com.chess4math.MyBankingApp.enums.TransactionType;
import com.chess4math.MyBankingApp.model.Account;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Builder
@Value
public class TransactionDTO {

    Long id;

    BigDecimal amount;

    TransactionType type;

    LocalDateTime timestamp;

    Account account;
}
