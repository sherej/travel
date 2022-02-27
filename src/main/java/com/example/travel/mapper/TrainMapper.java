package com.example.travel.mapper;

import com.example.travel.common.BaseMapper;
import com.example.travel.dto.BusDTO;
import com.example.travel.dto.TrainDTO;
import com.example.travel.entity.Bus;
import com.example.travel.entity.Train;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",uses=VehicleMapper.class)
public interface TrainMapper extends BaseMapper<Train,TrainDTO> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget Train entity, TrainDTO dto);
//    Train toEntity(TrainDTO dto);
//    TrainDTO toDTO(Train entity);
//    List<Train> toEntities(List<TrainDTO> dtos);
//    List<TrainDTO> toDTOs(List<Train> entites);
}
