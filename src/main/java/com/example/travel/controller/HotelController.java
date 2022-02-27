package com.example.travel.controller;

import com.example.travel.common.SearchCriteria;
import com.example.travel.dto.HotelDTO;
import com.example.travel.entity.Hotel;
import com.example.travel.mapper.HotelMapper;
import com.example.travel.service.iservice.HotelService;
import com.example.travel.common.BaseSpecification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/hotel")
public class HotelController {
    private final HotelService service;

    private final HotelMapper mapper;

    public HotelController(HotelService service, HotelMapper mapper) {
        this. service= service;
        this. mapper= mapper;
    }

    @GetMapping("/{id}")
    public HotelDTO findById(@PathVariable("id") Long id) {
        return mapper.toDto(service.findById(id).get());
    }

    @PutMapping("/save")
    public ResponseEntity<Void> save(@RequestBody HotelDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/search")
    List<Hotel> search(@RequestBody  List<SearchCriteria> searchCriteria){
        BaseSpecification<Hotel> specification = new BaseSpecification<Hotel>();

        searchCriteria.forEach(searchCriteria1 -> {
            specification.add(searchCriteria1);
        });

        List<Hotel> all = service.findAll(specification);


        return all;
    }
}
