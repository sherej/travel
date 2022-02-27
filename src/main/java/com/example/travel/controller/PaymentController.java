package com.example.travel.controller;

import com.example.travel.dto.PaymentDTO;
import com.example.travel.mapper.PaymentMapper;
import com.example.travel.service.iservice.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {
    private final PaymentService service;

    private final PaymentMapper mapper;

    public PaymentController(PaymentService service,PaymentMapper  mapper) {
        this. service= service;
        this. mapper= mapper;
    }

    @GetMapping("/{id}")
    public PaymentDTO findById(@PathVariable("id") Long id) {
        return mapper.toDto(service.findById(id).get());
    }

    @PutMapping("/save")
    public ResponseEntity<Void> save(@RequestBody PaymentDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
