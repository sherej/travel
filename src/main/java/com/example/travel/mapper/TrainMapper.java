package com.example.travel.mapper;

import com.example.travel.dto.BusDTO;
import com.example.travel.dto.TrainDTO;
import com.example.travel.entity.Bus;
import com.example.travel.entity.Train;
import org.mapstruct.Mapper;

import java.util.List;

//@Mapper(componentModel = "spring",uses=VehicleMapper.class)
public interface TrainMapper {
    Train toEntity(TrainDTO dto);
    TrainDTO toDTO(Train entity);
    List<Train> toEntities(List<TrainDTO> dtos);
    List<TrainDTO> toDTOs(List<Train> entites);
}
