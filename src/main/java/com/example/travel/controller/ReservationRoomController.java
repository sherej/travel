package com.example.travel.controller;

import com.example.travel.dto.ReservationRoomDTO;
import com.example.travel.mapper.ReservationRoomMapper;
import com.example.travel.service.iservice.ReservationRoomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/reservationroom")
public class ReservationRoomController {
    private final ReservationRoomService service;

    private final ReservationRoomMapper mapper;

    public ReservationRoomController(ReservationRoomService service, ReservationRoomMapper mapper) {
        this. service= service;
        this. mapper= mapper;
    }

    @GetMapping("/{id}")
    public ReservationRoomDTO findById(@PathVariable("id") Long id) {
        return mapper.toDto(service.findById(id).get());
    }

    @PutMapping("/save")
    public ResponseEntity<Void> save(@RequestBody ReservationRoomDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
