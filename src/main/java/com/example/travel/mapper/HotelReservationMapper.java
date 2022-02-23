package com.example.travel.mapper;

import com.example.travel.dto.HotelDTO;
import com.example.travel.dto.HotelReservationDTO;
import com.example.travel.entity.Hotel;
import com.example.travel.entity.HotelReservation;
import org.mapstruct.Mapper;

import java.util.List;

//@Mapper(componentModel = "spring",uses = {UserMapper.class,PaymentMapper.class})//BaseMapper.class,
public interface HotelReservationMapper {//extends BaseMapper
    HotelReservation toEntity(HotelReservationDTO dto);
    HotelReservationDTO toDTO(HotelReservation entity);
    List<HotelReservation> toEntities(List<HotelReservationDTO> dtos);
    List<HotelReservationDTO> toDTOs(List<HotelReservation> entites);
}
