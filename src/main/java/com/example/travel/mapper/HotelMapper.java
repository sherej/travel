package com.example.travel.mapper;

import com.example.travel.dto.CompanyDTO;
import com.example.travel.dto.HotelDTO;
import com.example.travel.entity.Company;
import com.example.travel.entity.Hotel;
import org.mapstruct.Mapper;

import java.util.List;

//@Mapper(componentModel = "spring",uses = {CityMapper.class})//BaseMapper.class,
public interface HotelMapper {//extends BaseMapper
    Hotel toEntity(HotelDTO dto);
    HotelDTO toDTO(Hotel entity);
    List<Hotel> toEntities(List<HotelDTO> dtos);
    List<HotelDTO> toDTOs(List<Hotel> entites);
}
