package com.example.reporting.dao;

import com.example.reporting.entity.EtatbcmBalancegenerale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceGeneraleRepository extends JpaRepository<EtatbcmBalancegenerale, Long> {
}
