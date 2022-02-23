package com.example.travel.mapper;

import com.example.travel.dto.RoomDTO;
import com.example.travel.dto.TravelScheduleDTO;
import com.example.travel.entity.Room;
import com.example.travel.entity.TravelSchedule;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

//@Mapper(componentModel = "spring",uses = {TerminalMapper.class, VehicleMapper.class})//BaseMapper.class,
public interface TravelScheduleMapper {//extends BaseMapper
    //    @Mapping(source = "inch", target = "centimeter", qualifiedByName = "inchToCentimeter")
//    public TravelScheduleMapper travelScheduleMapper(TravelScheduleDTO dto);
//    @Named("toEntity")
    TravelSchedule toEntity(TravelScheduleDTO dto);
    TravelScheduleDTO toDTO(TravelSchedule entity);
    List<TravelSchedule> toEntities(List<TravelScheduleDTO> dtos);
    List<TravelScheduleDTO> toDTOs(List<TravelSchedule> entites);
}
