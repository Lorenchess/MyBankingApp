package com.chess4math.MyBankingApp.dto;

import com.chess4math.MyBankingApp.enums.TransactionType;
import com.chess4math.MyBankingApp.model.Account;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Builder
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO {

    private Long id;

    private BigDecimal amount;

    private TransactionType type;

    private LocalDateTime timestamp;

    private Account account;
}
