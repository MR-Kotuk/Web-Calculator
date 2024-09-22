package com.mr_kotuk.WebCalculator.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mr_kotuk.WebCalculator.model.Calculate;
import com.mr_kotuk.WebCalculator.services.CalculatorService;

import lombok.AllArgsConstructor;

@CrossOrigin
@RestController
@AllArgsConstructor
public class CalculateController {
    private final CalculatorService service;

    @PostMapping("/calculate")
    public ResponseEntity<Double> calculate(@RequestBody Calculate calculate) {
        return new ResponseEntity<>(service.calculate(calculate), HttpStatus.OK);
    }
}