package com.example.reporting.controller;

import com.example.reporting.entity.EtatbcmBalancegenerale;
import com.example.reporting.services.BalanceGeneraleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/api")
public class BalanceGeneraleController {
    @Autowired
    private BalanceGeneraleService service;

    @GetMapping("/balance_generale")
    public ResponseEntity<List<EtatbcmBalancegenerale>> getAllBalanceGenerale(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }
}
