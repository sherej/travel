package com.example.travel.mapper;

import com.example.travel.dto.CityDTO;
import com.example.travel.dto.CountryDTO;
import com.example.travel.entity.City;
import com.example.travel.entity.Country;
import org.mapstruct.Mapper;

import java.util.List;

//@Mapper(componentModel = "spring",uses = {CountryMapper.class})//BaseMapper.class,
public interface CityMapper {//extends BaseMapper
    City toEntity(CityDTO dto);
    CityDTO toDTO(City entity);
    List<City> toEntities(List<CityDTO> dtos);
    List<CityDTO> toDTOs(List<City> entites);
}
