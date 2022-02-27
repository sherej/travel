package com.example.travel.mapper;

import com.example.travel.common.BaseMapper;
import com.example.travel.dto.HotelDTO;
import com.example.travel.dto.RoomDTO;
import com.example.travel.entity.Hotel;
import com.example.travel.entity.Room;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",uses = {HotelMapper.class})
public interface RoomMapper extends BaseMapper<Room,RoomDTO> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget Room entity, RoomDTO dto);
//    Room toEntity(RoomDTO dto);
//    RoomDTO toDTO(Room entity);
//    List<Room> toEntities(List<RoomDTO> dtos);
//    List<RoomDTO> toDTOs(List<Room> entites);
}
