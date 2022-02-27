package com.example.travel.mapper;

import com.example.travel.dto.TourDTO;
import com.example.travel.entity.City;
import com.example.travel.entity.Company;
import com.example.travel.entity.Tour;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-27T17:47:43+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class TourMapperImpl implements TourMapper {

    @Autowired
    private CityMapper cityMapper;
    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public Tour toEntity(TourDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Tour tour = new Tour();

        tour.setOrganizer( companyMapper.toEntity( dto.getOrganizer() ) );
        tour.setCity( cityMapper.toEntity( dto.getCity() ) );

        return tour;
    }

    @Override
    public TourDTO toDto(Tour entity) {
        if ( entity == null ) {
            return null;
        }

        TourDTO tourDTO = new TourDTO();

        tourDTO.setOrganizer( companyMapper.toDto( entity.getOrganizer() ) );
        tourDTO.setCity( cityMapper.toDto( entity.getCity() ) );

        return tourDTO;
    }

    @Override
    public List<Tour> toEntities(List<TourDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Tour> list = new ArrayList<Tour>( dtos.size() );
        for ( TourDTO tourDTO : dtos ) {
            list.add( toEntity( tourDTO ) );
        }

        return list;
    }

    @Override
    public List<TourDTO> toDtos(List<Tour> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TourDTO> list = new ArrayList<TourDTO>( entities.size() );
        for ( Tour tour : entities ) {
            list.add( toDto( tour ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Tour entity, TourDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getOrganizer() != null ) {
            if ( entity.getOrganizer() == null ) {
                entity.setOrganizer( new Company() );
            }
            companyMapper.partialUpdate( entity.getOrganizer(), dto.getOrganizer() );
        }
        if ( dto.getCity() != null ) {
            if ( entity.getCity() == null ) {
                entity.setCity( new City() );
            }
            cityMapper.partialUpdate( entity.getCity(), dto.getCity() );
        }
    }
}
