package com.chess4math.MyBankingApp.dto;

import lombok.*;


@Builder
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class CreditScoreDTO {

    Long id;

    private String ssn;

    private Integer score;
}
