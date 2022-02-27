package com.example.travel.controller;

import com.example.travel.dto.PersonDTO;
import com.example.travel.mapper.PersonMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
//    private final PersonService service;
//
//    private final PersonMapper mapper;
//
//    public PersonController(PersonService service,PersonMapper  mapper) {
//        this. service= service;
//        this. mapper= mapper;
//    }
//
//    @GetMapping("/{id}")
//    public PersonDTO findById(@PathVariable("id") Long id) {
//        return mapper.toDto(service.findById(id).get());
//    }
}
