package com.example.travel.mapper;

import com.example.travel.dto.CityDTO;
import com.example.travel.entity.City;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-27T17:47:43+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class CityMapperImpl implements CityMapper {

    @Override
    public City toEntity(CityDTO dto) {
        if ( dto == null ) {
            return null;
        }

        City city = new City();

        city.setName( dto.getName() );
        city.setCountry( dto.getCountry() );

        return city;
    }

    @Override
    public CityDTO toDto(City entity) {
        if ( entity == null ) {
            return null;
        }

        CityDTO cityDTO = new CityDTO();

        cityDTO.setName( entity.getName() );
        cityDTO.setCountry( entity.getCountry() );

        return cityDTO;
    }

    @Override
    public List<City> toEntities(List<CityDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<City> list = new ArrayList<City>( dtos.size() );
        for ( CityDTO cityDTO : dtos ) {
            list.add( toEntity( cityDTO ) );
        }

        return list;
    }

    @Override
    public List<CityDTO> toDtos(List<City> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CityDTO> list = new ArrayList<CityDTO>( entities.size() );
        for ( City city : entities ) {
            list.add( toDto( city ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(City entity, CityDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getName() != null ) {
            entity.setName( dto.getName() );
        }
        if ( dto.getCountry() != null ) {
            entity.setCountry( dto.getCountry() );
        }
    }
}
