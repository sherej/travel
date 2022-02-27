package com.example.travel.controller;

import com.example.travel.common.SearchCriteria;
import com.example.travel.dto.TravelScheduleDTO;
import com.example.travel.entity.TravelSchedule;
import com.example.travel.mapper.TravelScheduleMapper;
import com.example.travel.service.iservice.TravelScheduleService;
import com.example.travel.common.BaseSpecification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/travelschedule")
public class TravelScheduleController {
    private final TravelScheduleService service;

    private final TravelScheduleMapper mapper;

    public TravelScheduleController(TravelScheduleService service, TravelScheduleMapper  mapper) {
        this. service= service;
        this. mapper= mapper;
    }

    @GetMapping("/{id}")
    public TravelScheduleDTO findById(@PathVariable("id") Long id) {
        return mapper.toDto(service.findById(id).get());
    }

    @PutMapping("/save")
    public ResponseEntity<Void> save(@RequestBody TravelScheduleDTO dto){
        service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/search")
    List<TravelSchedule> search(@RequestBody  List<SearchCriteria> searchCriteria){
        BaseSpecification<TravelSchedule> specification = new BaseSpecification<TravelSchedule>();

        searchCriteria.forEach(searchCriteria1 -> {
            specification.add(searchCriteria1);
        });

        List<TravelSchedule> all = service.findAll(specification);


        return all;
    }
}
