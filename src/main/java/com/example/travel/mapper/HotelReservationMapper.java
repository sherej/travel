package com.example.travel.mapper;

import com.example.travel.common.BaseMapper;
import com.example.travel.dto.HotelDTO;
import com.example.travel.dto.HotelReservationDTO;
import com.example.travel.entity.Hotel;
import com.example.travel.entity.HotelReservation;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",uses = {UserMapper.class,PaymentMapper.class})
public interface HotelReservationMapper extends BaseMapper<HotelReservation,HotelReservationDTO> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget HotelReservation entity,HotelReservationDTO dto);
//    HotelReservation toEntity(HotelReservationDTO dto);
//    HotelReservationDTO toDTO(HotelReservation entity);
//    List<HotelReservation> toEntities(List<HotelReservationDTO> dtos);
//    List<HotelReservationDTO> toDTOs(List<HotelReservation> entites);
}
