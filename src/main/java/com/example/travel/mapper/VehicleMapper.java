package com.example.travel.mapper;

import com.example.travel.dto.BaseDTO;
import com.example.travel.dto.VehicleDTO;
import com.example.travel.entity.Vehicle;
import org.mapstruct.Mapper;

import java.util.List;

//@Mapper(componentModel = "spring")//,uses = BaseMapper.class
public interface VehicleMapper {//extends BaseMapper
    Vehicle toVehicleEntity(VehicleDTO dto);
    VehicleDTO toVehicleDTO(Vehicle vehicle);
    List<Vehicle> toVehicleEntities(List<VehicleDTO> dtos);
    List<VehicleDTO> toVehicleDTOs(List<Vehicle> entites);
}
