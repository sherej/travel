package com.example.travel.mapper;

import com.example.travel.common.BaseMapper;
import com.example.travel.dto.RoomDTO;
import com.example.travel.dto.TerminalDTO;
import com.example.travel.dto.TravelScheduleDTO;
import com.example.travel.entity.Room;
import com.example.travel.entity.Terminal;
import com.example.travel.entity.TravelSchedule;
//import com.example.travel.training.ToSource;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring",uses = {TerminalMapper.class, VehicleMapper.class})

public interface TravelScheduleMapper extends BaseMapper<TravelSchedule,TravelScheduleDTO> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget TravelSchedule entity, TravelScheduleDTO dto);



//    TravelSchedule toEntity(TravelScheduleDTO dto);
//    TravelScheduleDTO toDTO(TravelSchedule entity);
//    List<TravelSchedule> toEntities(List<TravelScheduleDTO> dtos);
//    List<TravelScheduleDTO> toDTOs(List<TravelSchedule> entites);
}
