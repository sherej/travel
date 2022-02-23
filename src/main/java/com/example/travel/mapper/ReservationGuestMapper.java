package com.example.travel.mapper;

import com.example.travel.dto.HotelReservationDTO;
import com.example.travel.dto.ReservationGuestDTO;
import com.example.travel.entity.HotelReservation;
import com.example.travel.entity.ReservationGuest;
import org.mapstruct.Mapper;

import java.util.List;

//@Mapper(componentModel = "spring",uses = {HotelReservationMapper.class
//        ,PassengerMapper.class})//BaseMapper.class,
public interface ReservationGuestMapper {//extends BaseMapper
    ReservationGuest toEntity(ReservationGuestDTO dto);
    ReservationGuestDTO toDTO(ReservationGuest entity);
    List<ReservationGuest> toEntities(List<ReservationGuestDTO> dtos);
    List<ReservationGuestDTO> toDTOs(List<ReservationGuest> entites);

}
