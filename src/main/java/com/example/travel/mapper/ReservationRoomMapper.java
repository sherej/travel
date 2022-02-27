package com.example.travel.mapper;

import com.example.travel.common.BaseMapper;
import com.example.travel.dto.ReservationRoomDTO;
import com.example.travel.dto.RoomDTO;
import com.example.travel.entity.HotelReservation;
import com.example.travel.entity.ReservationRoom;
import com.example.travel.entity.Room;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",uses = {HotelReservationMapper.class
        , RoomMapper.class})
public interface ReservationRoomMapper extends BaseMapper<ReservationRoom,ReservationRoomDTO> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget ReservationRoom entity,ReservationRoomDTO dto);
//    ReservationRoom toEntity(ReservationRoomDTO dto);
//    ReservationRoomDTO toDTO(ReservationRoom entity);
//    List<ReservationRoom> toEntities(List<ReservationRoomDTO> dtos);
//    List<ReservationRoomDTO> toDTOs(List<ReservationRoom> entites);
}
