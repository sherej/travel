package com.example.travel.controller;

import com.example.travel.dto.CompanyDTO;
import com.example.travel.mapper.CompanyMapper;
import com.example.travel.service.iservice.CompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/company")
public class CompanyController {
    private final CompanyService service;

    private final CompanyMapper mapper;

    public CompanyController(CompanyService service, CompanyMapper mapper) {
        this. service= service;
        this. mapper= mapper;
    }

    @GetMapping("/{id}")
    public CompanyDTO findById(@PathVariable("id") Long id) {
        return mapper.toDto(service.findById(id).get());
    }
    @PutMapping("/save")
    public ResponseEntity<Void> save(@RequestBody CompanyDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
