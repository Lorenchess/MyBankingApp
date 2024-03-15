package com.chess4math.MyBankingApp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String name;

    private String phoneNumber;

    private String emailAddress;

    private String address;

    private String ssn;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;

    @OneToMany(mappedBy = "customer")
    private Set<Account> accounts = new HashSet<>();

    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    private CreditScore creditScore;
}
