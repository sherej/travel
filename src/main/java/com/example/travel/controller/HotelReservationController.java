package com.example.travel.controller;

import com.example.travel.dto.HotelReservationDTO;
import com.example.travel.mapper.HotelReservationMapper;
import com.example.travel.service.iservice.HotelReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/hotelreservation")
public class HotelReservationController {
    private final HotelReservationService service;

    private final HotelReservationMapper mapper;

    public HotelReservationController(HotelReservationService service, HotelReservationMapper mapper) {
        this. service= service;
        this. mapper= mapper;
    }

    @GetMapping("/{id}")
    public HotelReservationDTO findById(@PathVariable("id") Long id) {
        return mapper.toDto(service.findById(id).get());
    }

    @PutMapping("/save")
    public ResponseEntity<Void> save(@RequestBody HotelReservationDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
