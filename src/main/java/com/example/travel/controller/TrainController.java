package com.example.travel.controller;

import com.example.travel.dto.TrainDTO;
import com.example.travel.mapper.TrainMapper;
import com.example.travel.service.iservice.TrainService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/train")
public class TrainController {
    private final TrainService service;

    private final TrainMapper mapper;

    public TrainController(TrainService service, TrainMapper mapper) {
        this. service= service;
        this. mapper= mapper;
    }

    @GetMapping("/{id}")
    public TrainDTO findById(@PathVariable("id") Long id) {
        return mapper.toDto(service.findById(id).get());
    }

    @PutMapping("/save")
    public ResponseEntity<Void> save(@RequestBody TrainDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
