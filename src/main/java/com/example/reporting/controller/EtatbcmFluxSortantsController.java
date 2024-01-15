package com.example.reporting.controller;

import com.example.reporting.entity.EtatbcmFluxEntrants;
import com.example.reporting.entity.EtatbcmFluxSortants;
import com.example.reporting.services.EtatbcmFluxSortantsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping("/api")

public class EtatbcmFluxSortantsController {

    @Autowired
    private EtatbcmFluxSortantsService service;

    @GetMapping("/flux_sortant")
    public ResponseEntity<List<EtatbcmFluxSortants>> getAllSortant(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }
    @PostMapping("/test")
    public String postBody(@RequestBody String fullName) {
        return "Hello " + fullName;
    }



    @PostMapping("/findByBeneficiaire")
    public ResponseEntity<?> findByBeneficiaire(@RequestBody String beneficiaire) {
        try {
            List<EtatbcmFluxSortants> result = service.findByBeneficiaire(beneficiaire);

            return ResponseEntity.ok(result);
        } catch (Exception e) {
            // Ici, vous pouvez ajouter des logs pour déboguer l'exception

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erreur interne du serveur");
        }
    }
}

