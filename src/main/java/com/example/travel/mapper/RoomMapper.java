package com.example.travel.mapper;

import com.example.travel.dto.HotelDTO;
import com.example.travel.dto.RoomDTO;
import com.example.travel.entity.Hotel;
import com.example.travel.entity.Room;
import org.mapstruct.Mapper;

import java.util.List;

//@Mapper(componentModel = "spring",uses = {HotelMapper.class})//BaseMapper.class,
public interface RoomMapper {//extends BaseMapper
    Room toEntity(RoomDTO dto);
    RoomDTO toDTO(Room entity);
    List<Room> toEntities(List<RoomDTO> dtos);
    List<RoomDTO> toDTOs(List<Room> entites);
}
