package com.example.travel.mapper;

import com.example.travel.common.BaseMapper;
import com.example.travel.dto.HotelReservationDTO;
import com.example.travel.dto.ReservationGuestDTO;
import com.example.travel.entity.HotelReservation;
import com.example.travel.entity.ReservationGuest;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",uses = {HotelReservationMapper.class
        ,PassengerMapper.class})
public interface ReservationGuestMapper extends BaseMapper<ReservationGuest,ReservationGuestDTO> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget ReservationGuest entity,ReservationGuestDTO dto);
//    ReservationGuest toEntity(ReservationGuestDTO dto);
//    ReservationGuestDTO toDTO(ReservationGuest entity);
//    List<ReservationGuest> toEntities(List<ReservationGuestDTO> dtos);
//    List<ReservationGuestDTO> toDTOs(List<ReservationGuest> entites);

}
