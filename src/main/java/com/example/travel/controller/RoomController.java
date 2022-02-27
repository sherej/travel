package com.example.travel.controller;

import com.example.travel.common.SearchCriteria;
import com.example.travel.dto.RoomDTO;
import com.example.travel.entity.Room;
import com.example.travel.mapper.RoomMapper;
import com.example.travel.service.iservice.RoomService;
import com.example.travel.common.BaseSpecification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/room")
public class RoomController {
    private final RoomService service;

    private final RoomMapper mapper;

    public RoomController(RoomService service, RoomMapper mapper) {
        this. service= service;
        this. mapper= mapper;
    }

    @GetMapping("/{id}")
    public RoomDTO findById(@PathVariable("id") Long id) {
        return mapper.toDto(service.findById(id).get());
    }

    @PutMapping("/save")
    public ResponseEntity<Void> save(@RequestBody RoomDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/search")
    List<Room> search(@RequestBody  List<SearchCriteria> searchCriteria){
        BaseSpecification<Room> specification = new BaseSpecification<Room>();

        searchCriteria.forEach(searchCriteria1 -> {
            specification.add(searchCriteria1);
        });

        List<Room> all = service.findAll(specification);


        return all;
    }
}
