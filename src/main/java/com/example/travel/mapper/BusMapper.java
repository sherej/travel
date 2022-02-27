package com.example.travel.mapper;

import com.example.travel.common.BaseMapper;
import com.example.travel.dto.AirplaneDTO;
import com.example.travel.dto.BusDTO;
import com.example.travel.entity.Airplane;
import com.example.travel.entity.Bus;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",uses=VehicleMapper.class)
public interface BusMapper extends BaseMapper<Bus,BusDTO> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget Bus entity,BusDTO  dto);
//    Bus toEntity(BusDTO dto);
//    BusDTO toDTO(Bus entity);
//    List<Bus> toEntities(List<BusDTO> dtos);
//    List<BusDTO> toDTOs(List<Bus> entites);
}
