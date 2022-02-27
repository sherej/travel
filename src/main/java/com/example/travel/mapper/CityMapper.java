package com.example.travel.mapper;

import com.example.travel.common.BaseMapper;
import com.example.travel.dto.CityDTO;
import com.example.travel.dto.CountryDTO;
import com.example.travel.entity.City;
import com.example.travel.entity.Country;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",uses = {CountryMapper.class})
public interface CityMapper extends BaseMapper<City,CityDTO> {

@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget  City entity, CityDTO dto);

//    City toEntity(CityDTO dto);
//    CityDTO toDTO(City entity);
//    List<City> toEntities(List<CityDTO> dtos);
//    List<CityDTO> toDTOs(List<City> entites);
}
