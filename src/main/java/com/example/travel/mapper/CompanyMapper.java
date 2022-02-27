package com.example.travel.mapper;

import com.example.travel.common.BaseMapper;
import com.example.travel.dto.CompanyDTO;

import com.example.travel.entity.Company;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",uses = {CityMapper.class})
public interface CompanyMapper extends BaseMapper<Company,CompanyDTO> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget Company entity,CompanyDTO dto);
//    Company toEntity(CompanyDTO dto);
//    CompanyDTO toDTO(Company entity);
//    List<Company> toEntities(List<CompanyDTO> dtos);
//    List<CompanyDTO> toDTOs(List<Company> entites);
}
