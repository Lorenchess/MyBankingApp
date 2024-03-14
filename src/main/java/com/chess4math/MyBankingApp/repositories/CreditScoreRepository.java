package com.chess4math.MyBankingApp.repositories;

import com.chess4math.MyBankingApp.model.CreditScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditScoreRepository extends JpaRepository<CreditScore, Long> {
}
