package com.example.travel.mapper;

import com.example.travel.common.BaseMapper;
import com.example.travel.dto.RoomDTO;
import com.example.travel.dto.TourDTO;
import com.example.travel.entity.Company;
import com.example.travel.entity.Room;
import com.example.travel.entity.Tour;
import com.example.travel.entity.TravelSchedule;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",uses = { CityMapper.class, CompanyMapper.class})
public interface TourMapper extends BaseMapper<Tour,TourDTO> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget Tour entity, TourDTO dto);
//    Tour toEntity(TourDTO dto);
//    TourDTO toDTO(Tour entity);
//    List<Tour> toEntities(List<TourDTO> dtos);
//    List<TourDTO> toDTOs(List<Tour> entites);
}
