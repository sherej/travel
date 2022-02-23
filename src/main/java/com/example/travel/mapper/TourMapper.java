package com.example.travel.mapper;

import com.example.travel.dto.RoomDTO;
import com.example.travel.dto.TourDTO;
import com.example.travel.entity.Company;
import com.example.travel.entity.Room;
import com.example.travel.entity.Tour;
import com.example.travel.entity.TravelSchedule;
import org.mapstruct.Mapper;

import java.util.List;

//@Mapper(componentModel = "spring",uses = { CityMapper.class, CompanyMapper.class})//BaseMapper.class,
public interface TourMapper {//extends BaseMapper
    Tour toEntity(TourDTO dto);
    TourDTO toDTO(Tour entity);
    List<Tour> toEntities(List<TourDTO> dtos);
    List<TourDTO> toDTOs(List<Tour> entites);
}
