package com.insurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class InsuranceController {

    @Autowired
    InsuranceService insuranceService;

    @PostMapping("/api/insurance")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> createInsurance(@RequestBody Insurance insurance) {

        insuranceService.save(insurance);

        return ResponseEntity.status(HttpStatus.OK).body("insurance successfully created");
    }

    @GetMapping("/api/insurances")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> showInsurance() {

        return ResponseEntity.status(HttpStatus.OK).body(insuranceService.findAll());

    }
}
