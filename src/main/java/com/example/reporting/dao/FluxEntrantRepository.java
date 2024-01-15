package com.example.reporting.dao;

import com.example.reporting.entity.EtatbcmFluxEntrants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface FluxEntrantRepository extends JpaRepository<EtatbcmFluxEntrants, BigInteger> {
    List<EtatbcmFluxEntrants> findByDatetransaction(LocalDate date);
}
