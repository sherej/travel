package com.example.travel.mapper;

import com.example.travel.common.BaseMapper;
import com.example.travel.dto.CompanyDTO;
import com.example.travel.dto.HotelDTO;
import com.example.travel.entity.Company;
import com.example.travel.entity.Hotel;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",uses = {CityMapper.class})
public interface HotelMapper extends BaseMapper<Hotel,HotelDTO> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget Hotel entity,HotelDTO dto);
//    Hotel toEntity(HotelDTO dto);
//    HotelDTO toDTO(Hotel entity);
//    List<Hotel> toEntities(List<HotelDTO> dtos);
//    List<HotelDTO> toDTOs(List<Hotel> entites);
}
