package com.example.reporting.services;

import com.example.reporting.dao.BalanceDetaileeRepository;
import com.example.reporting.dao.FluxEntrantRepository;
import com.example.reporting.entity.EtatbcmBalancedetaillee;
import com.example.reporting.entity.EtatbcmFluxEntrants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BalanceDetaileeService {
    @Autowired
    private BalanceDetaileeRepository repository;
    public List<EtatbcmBalancedetaillee> findAll(){
        return repository.findAll();
    }
}
