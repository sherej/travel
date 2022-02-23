package com.example.travel.mapper;

import com.example.travel.dto.CompanyDTO;

import com.example.travel.entity.Company;
import org.mapstruct.Mapper;

import java.util.List;

//@Mapper(componentModel = "spring",uses = {CityMapper.class})//BaseMapper.class,
public interface CompanyMapper {//extends BaseMapper
    Company toEntity(CompanyDTO dto);
    CompanyDTO toDTO(Company entity);
    List<Company> toEntities(List<CompanyDTO> dtos);
    List<CompanyDTO> toDTOs(List<Company> entites);
}
