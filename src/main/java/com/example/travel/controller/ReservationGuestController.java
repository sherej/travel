package com.example.travel.controller;

import com.example.travel.dto.ReservationGuestDTO;
import com.example.travel.mapper.ReservationGuestMapper;
import com.example.travel.service.iservice.ReservationGuestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/reservationguest")
public class ReservationGuestController {
    private final ReservationGuestService service;

    private final ReservationGuestMapper mapper;

    public ReservationGuestController(ReservationGuestService service, ReservationGuestMapper mapper) {
        this. service= service;
        this. mapper= mapper;
    }

    @GetMapping("/{id}")
    public ReservationGuestDTO findById(@PathVariable("id") Long id) {
        return mapper.toDto(service.findById(id).get());
    }

    @PutMapping("/save")
    public ResponseEntity<Void> save(@RequestBody ReservationGuestDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
