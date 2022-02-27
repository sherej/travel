package com.example.travel.mapper;


import com.example.travel.common.BaseMapper;
import com.example.travel.dto.CountryDTO;

import com.example.travel.entity.Country;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountryMapper extends BaseMapper<Country,CountryDTO> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget Country entity,CountryDTO dto);
//    Country toEntity(CountryDTO dto);
//    CountryDTO toDTO(Country entity);
//    List<Country> toEntities(List<CountryDTO> dtos);
//    List<CountryDTO> toDTOs(List<Country> entites);
}
