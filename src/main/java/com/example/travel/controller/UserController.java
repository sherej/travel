package com.example.travel.controller;

import com.example.travel.dto.UserDTO;
import com.example.travel.mapper.UserMapper;
import com.example.travel.service.iservice.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    private final UserService service;

    private final UserMapper mapper;

    public UserController(UserService service,UserMapper  mapper) {
        this. service= service;
        this. mapper= mapper;
    }

    @GetMapping("/{id}")
    public UserDTO findById(@PathVariable("id") Long id) {
        return mapper.toDto(service.findById(id).get());
    }

    @PutMapping("/save")
    public ResponseEntity<Void> save(@RequestBody UserDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
