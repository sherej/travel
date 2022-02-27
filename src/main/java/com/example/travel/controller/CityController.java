package com.example.travel.controller;

import com.example.travel.dto.CityDTO;
import com.example.travel.mapper.CityMapper;
import com.example.travel.service.iservice.CityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/city")
public class CityController {
    private final CityService service;

    private final CityMapper mapper;

    public CityController(CityService service, CityMapper mapper) {
        this. service= service;
        this. mapper= mapper;
    }

    @GetMapping("/{id}")
    public CityDTO findById(@PathVariable("id") Long id) {
        return mapper.toDto(service.findById(id).get());
    }
    @PutMapping("/save")
    public ResponseEntity<Void> save(@RequestBody CityDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
