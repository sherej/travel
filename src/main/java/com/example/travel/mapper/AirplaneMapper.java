package com.example.travel.mapper;

import com.example.travel.dto.AirplaneDTO;
import com.example.travel.dto.VehicleDTO;
import com.example.travel.entity.Airplane;
import com.example.travel.entity.Vehicle;
import org.mapstruct.Mapper;

import java.util.List;

//@Mapper(componentModel = "spring")//,uses=BaseMapper.class
public interface AirplaneMapper extends VehicleMapper{
    Airplane toEntity(AirplaneDTO dto);
    AirplaneDTO toDTO(Airplane entity);
    List<Airplane> toEntities(List<AirplaneDTO> dtos);
    List<AirplaneDTO> toDTOs(List<Airplane> entites);
}
