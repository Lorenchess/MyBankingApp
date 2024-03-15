package com.chess4math.MyBankingApp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class CreditScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String ssn;

    private Integer score;

    @OneToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;
}
