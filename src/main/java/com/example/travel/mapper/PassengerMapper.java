package com.example.travel.mapper;

import com.example.travel.dto.PassengerDTO;
import com.example.travel.entity.Passenger;

import org.mapstruct.Mapper;

import java.util.List;

//@Mapper(componentModel = "spring")//,uses=PersonMapper.class
public interface PassengerMapper {//extends PersonMapper
    Passenger toPassengerEntity(PassengerDTO dto);
    PassengerDTO toPassengerDTO(Passenger passenger);
    List<Passenger> toPassengerEntities(List<PassengerDTO> dtos);
    List<PassengerDTO> toPassengerDTOs(List<Passenger> entites);
}
