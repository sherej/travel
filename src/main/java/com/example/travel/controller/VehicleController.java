package com.example.travel.controller;

import com.example.travel.dto.VehicleDTO;
import com.example.travel.mapper.VehicleMapper;
import com.example.travel.service.iservice.VehicleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/vehicle")
public class VehicleController {
    private final VehicleService service;

    private final VehicleMapper mapper;

    public VehicleController(VehicleService service, VehicleMapper  mapper) {
        this. service= service;
        this. mapper= mapper;
    }

    @GetMapping("/{id}")
    public VehicleDTO findById(@PathVariable("id") Long id) {
        return mapper.toDto(service.findById(id).get());
    }

    @PutMapping("/save")
    public ResponseEntity<Void> save(@RequestBody VehicleDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
