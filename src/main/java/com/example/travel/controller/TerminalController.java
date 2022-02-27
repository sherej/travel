package com.example.travel.controller;

import com.example.travel.dto.TerminalDTO;
import com.example.travel.mapper.TerminalMapper;
import com.example.travel.service.iservice.TerminalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/terminal")
public class TerminalController {
    private final TerminalService service;

    private final TerminalMapper mapper;

    public TerminalController(TerminalService service, TerminalMapper  mapper) {
        this. service= service;
        this. mapper= mapper;
    }

    @GetMapping("/{id}")
    public TerminalDTO findById(@PathVariable("id") Long id) {
        return mapper.toDto(service.findById(id).get());
    }

    @PutMapping("/save")
    public ResponseEntity<Void> save(@RequestBody TerminalDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
