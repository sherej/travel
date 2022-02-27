package com.example.travel.controller;

import com.example.travel.dto.BusDTO;
import com.example.travel.mapper.BusMapper;
import com.example.travel.service.iservice.BusService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/bus")
public class BusController {
    private final BusService service;

    private final BusMapper mapper;

    public BusController(BusService service,BusMapper  mapper) {
        this. service= service;
        this. mapper= mapper;
    }

    @GetMapping("/{id}")
    public BusDTO findById(@PathVariable("id") Long id) {
        return mapper.toDto(service.findById(id).get());
    }
    @PutMapping("/save")
    public ResponseEntity<Void> save(@RequestBody BusDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
