package com.example.travel.controller;

import com.example.travel.dto.PassengerDTO;
import com.example.travel.mapper.PassengerMapper;
import com.example.travel.service.iservice.PassengerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/passenger")
public class PassengerController {
    private final PassengerService service;

    private final PassengerMapper mapper;

    public PassengerController(PassengerService service, PassengerMapper mapper) {
        this. service= service;
        this. mapper= mapper;
    }

    @GetMapping("/{id}")
    public PassengerDTO findById(@PathVariable("id") Long id) {
        return mapper.toDto(service.findById(id).get());
    }

    @PutMapping("/save")
    public ResponseEntity<Void> save(@RequestBody PassengerDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
