package com.example.travel.controller;

import com.example.travel.dto.AirplaneDTO;
import com.example.travel.mapper.AirplaneMapper;
import com.example.travel.service.iservice.AirplaneService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/airplane")
public class AirplaneController {
    private final AirplaneService service;

    private final AirplaneMapper mapper;

    public AirplaneController(AirplaneService service, AirplaneMapper mapper) {
        this. service= service;
        this. mapper= mapper;
    }

    @GetMapping("/{id}")

    public AirplaneDTO findById(@PathVariable("id") Long id) {
        return mapper.toDto(service.findById(id).get());
    }
    @PutMapping("/save")
    public ResponseEntity<Void> save(@RequestBody AirplaneDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
