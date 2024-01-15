package com.example.reporting.services;

import com.example.reporting.dao.FluxEntrantRepository;
import com.example.reporting.entity.EtatbcmFluxEntrants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FluxEntrantService {
    @Autowired
    private FluxEntrantRepository repository;
    public List<EtatbcmFluxEntrants> findAll(){

        return repository.findAll();
    }

    // Méthode pour récupérer les flux entrants par date de transaction
    public List<EtatbcmFluxEntrants> findByDateTransaction(LocalDate date) {
        return repository.findByDatetransaction(date);
    }
}
