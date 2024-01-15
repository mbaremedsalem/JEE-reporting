package com.example.reporting.services;
import com.example.reporting.dao.EtatbcmFluxSortantsRepository;
import com.example.reporting.entity.EtatbcmFluxSortants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class EtatbcmFluxSortantsService {

    @Autowired
    private EtatbcmFluxSortantsRepository repository;
    public List<EtatbcmFluxSortants> findAll(){

        return repository.findAll();
    }

    public List<EtatbcmFluxSortants> findByBeneficiaire(String beneficiaire) {
        return repository.findByBeneficiaire(beneficiaire);
    }
}