package com.example.travel.controller;

import com.example.travel.dto.CountryDTO;
import com.example.travel.entity.Country;
import com.example.travel.mapper.CountryMapper;
import com.example.travel.service.CountryServiceImpl;
import com.example.travel.service.iservice.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/country")
public class CountryController {
    private final CountryService service;

    private final CountryMapper mapper;

    public CountryController(CountryService service, CountryMapper mapper) {
        this. service= service;
        this. mapper= mapper;
    }

    @GetMapping("/{id}")
    public CountryDTO findById(@PathVariable("id") Long id) {
        return mapper.toDto(service.findById(id).get());
    }

//    private CountryServiceImpl countryService;
//
//    public CountryController(CountryServiceImpl countryService) {
//        this.countryService = countryService;
//    }
//
    @PutMapping("/save")
    public ResponseEntity<Void> save(@RequestBody CountryDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
