package com.example.reporting.dao;

import com.example.reporting.entity.EtatbcmBalancedetaillee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
@Repository
public interface BalanceDetaileeRepository extends JpaRepository<EtatbcmBalancedetaillee, BigInteger> {
}
