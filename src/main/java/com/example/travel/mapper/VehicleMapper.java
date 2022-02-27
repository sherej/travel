package com.example.travel.mapper;


import com.example.travel.common.BaseMapper;
import com.example.travel.dto.VehicleDTO;
import com.example.travel.entity.Vehicle;
import org.mapstruct.BeanMapping;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VehicleMapper extends BaseMapper<Vehicle,VehicleDTO> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget Vehicle entity,VehicleDTO dto);
//    Vehicle toVehicleEntity(VehicleDTO dto);
//    VehicleDTO toVehicleDTO(Vehicle vehicle);
//    List<Vehicle> toVehicleEntities(List<VehicleDTO> dtos);
//    List<VehicleDTO> toVehicleDTOs(List<Vehicle> entites);
}
