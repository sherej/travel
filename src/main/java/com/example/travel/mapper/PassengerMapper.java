package com.example.travel.mapper;

import com.example.travel.common.BaseMapper;
import com.example.travel.dto.PassengerDTO;
import com.example.travel.entity.Passenger;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PassengerMapper extends BaseMapper<Passenger,PassengerDTO> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget Passenger entity,PassengerDTO dto);
//    Passenger toPassengerEntity(PassengerDTO dto);
//    PassengerDTO toPassengerDTO(Passenger passenger);
//    List<Passenger> toPassengerEntities(List<PassengerDTO> dtos);
//    List<PassengerDTO> toPassengerDTOs(List<Passenger> entites);
}
