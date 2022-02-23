package com.example.travel.mapper;


import com.example.travel.dto.CountryDTO;

import com.example.travel.entity.Country;
import org.mapstruct.Mapper;

import java.util.List;

//@Mapper(componentModel = "spring")//,uses = {}
public interface CountryMapper {//extends BaseMapper
    Country toEntity(CountryDTO dto);
    CountryDTO toDTO(Country entity);
    List<Country> toEntities(List<CountryDTO> dtos);
    List<CountryDTO> toDTOs(List<Country> entites);
}
