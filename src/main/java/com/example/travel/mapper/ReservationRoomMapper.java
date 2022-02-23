package com.example.travel.mapper;

import com.example.travel.dto.ReservationRoomDTO;
import com.example.travel.dto.RoomDTO;
import com.example.travel.entity.HotelReservation;
import com.example.travel.entity.ReservationRoom;
import com.example.travel.entity.Room;
import org.mapstruct.Mapper;

import java.util.List;

//@Mapper(componentModel = "spring",uses = {HotelReservationMapper.class
//        , RoomMapper.class})//BaseMapper.class,
public interface ReservationRoomMapper {//extends BaseMapper
    ReservationRoom toEntity(ReservationRoomDTO dto);
    ReservationRoomDTO toDTO(ReservationRoom entity);
    List<ReservationRoom> toEntities(List<ReservationRoomDTO> dtos);
    List<ReservationRoomDTO> toDTOs(List<ReservationRoom> entites);
}
