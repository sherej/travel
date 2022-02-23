package com.example.travel.controller;

import com.example.travel.entity.Country;
import com.example.travel.service.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/country")
public class CountryController {

    private CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @PutMapping("/")
    public ResponseEntity<Void> save(@RequestBody Country country){
        countryService.save(country);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
