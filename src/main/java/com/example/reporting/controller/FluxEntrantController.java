package com.example.reporting.controller;

import com.example.reporting.entity.EtatbcmFluxEntrants;
import com.example.reporting.services.FluxEntrantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
public class FluxEntrantController {
    @Autowired
    private FluxEntrantService service;

    @GetMapping("/flux_entrant")
    public ResponseEntity<List<EtatbcmFluxEntrants>> getAllFluxEntrant(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    // Endpoint POST pour récupérer les flux entrants par date de transaction



}
