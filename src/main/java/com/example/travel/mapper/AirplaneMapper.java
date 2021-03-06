package com.example.travel.mapper;

import com.example.travel.common.BaseMapper;
import com.example.travel.dto.AirplaneDTO;
import com.example.travel.dto.VehicleDTO;
import com.example.travel.entity.Airplane;
import com.example.travel.entity.Vehicle;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AirplaneMapper extends BaseMapper<Airplane,AirplaneDTO> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget Airplane entity,AirplaneDTO dto);


//    Airplane toEntity(AirplaneDTO dto);
//    AirplaneDTO toDTO(Airplane entity);
//    List<Airplane> toEntities(List<AirplaneDTO> dtos);
//    List<AirplaneDTO> toDTOs(List<Airplane> entites);
}
