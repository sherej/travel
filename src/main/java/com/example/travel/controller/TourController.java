package com.example.travel.controller;

import com.example.travel.common.SearchCriteria;
import com.example.travel.dto.TourDTO;
import com.example.travel.entity.Tour;
import com.example.travel.mapper.TourMapper;
import com.example.travel.service.iservice.TourService;
import com.example.travel.common.BaseSpecification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tour")
public class TourController {
    private final TourService service;

    private final TourMapper mapper;

    public TourController(TourService service, TourMapper mapper) {
        this. service= service;
        this. mapper= mapper;
    }

    @GetMapping("/{id}")
    public TourDTO findById(@PathVariable("id") Long id) {
        return mapper.toDto(service.findById(id).get());
    }

    @PutMapping("/save")
    public ResponseEntity<Void> save(@RequestBody TourDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/search")
    List<Tour> search(@RequestBody  List<SearchCriteria> searchCriteria){
        BaseSpecification<Tour> specification = new BaseSpecification<Tour>();

        searchCriteria.forEach(searchCriteria1 -> {
            specification.add(searchCriteria1);
        });

        List<Tour> all = service.findAll(specification);


        return all;
    }
}
