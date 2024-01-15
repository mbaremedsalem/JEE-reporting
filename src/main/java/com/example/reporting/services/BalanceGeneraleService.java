package com.example.reporting.services;

import com.example.reporting.dao.BalanceGeneraleRepository;
import com.example.reporting.entity.EtatbcmBalancegenerale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BalanceGeneraleService {
    @Autowired
    private BalanceGeneraleRepository repository;
    public List<EtatbcmBalancegenerale> findAll(){
        return repository.findAll();
    }
}
