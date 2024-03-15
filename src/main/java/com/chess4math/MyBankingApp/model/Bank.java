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
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String name;

    private String phoneNumber;

    private String emailAddress;

    private String routingNumber;

    @OneToMany(mappedBy = "bank")
    private Set<Customer> customers = new HashSet<>();

}
