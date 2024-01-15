package com.example.reporting.dao;

import com.example.reporting.entity.EtatbcmFluxSortants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface EtatbcmFluxSortantsRepository extends JpaRepository<EtatbcmFluxSortants, BigInteger> {
    List<EtatbcmFluxSortants> findByBeneficiaire(String beneficiaire);
}
