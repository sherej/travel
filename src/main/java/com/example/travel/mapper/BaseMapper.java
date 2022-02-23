package com.example.travel.mapper;

import com.example.travel.dto.BaseDTO;
import com.example.travel.entity.BaseEntity;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;

import java.util.List;

//@Mapper(componentModel = "spring")
public interface BaseMapper {
    BaseEntity toBaseEntity(BaseDTO baseDTO);
    BaseDTO toBaseDTO(BaseEntity baseEntity);
//    @IterableMapping(qualifiedByName = "useMe")
    List<BaseDTO> toBaseDTOS(List<BaseEntity> baseEntities);
    List<BaseEntity> toBaseEntities(List<BaseDTO> baseDTOS);
}
