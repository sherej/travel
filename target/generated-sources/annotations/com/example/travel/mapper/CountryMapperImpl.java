package com.example.travel.mapper;

import com.example.travel.dto.CountryDTO;
import com.example.travel.entity.Country;
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
public class CountryMapperImpl implements CountryMapper {

    @Override
    public Country toEntity(CountryDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Country country = new Country();

        country.setName( dto.getName() );

        return country;
    }

    @Override
    public CountryDTO toDto(Country entity) {
        if ( entity == null ) {
            return null;
        }

        CountryDTO countryDTO = new CountryDTO();

        countryDTO.setName( entity.getName() );

        return countryDTO;
    }

    @Override
    public List<Country> toEntities(List<CountryDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Country> list = new ArrayList<Country>( dtos.size() );
        for ( CountryDTO countryDTO : dtos ) {
            list.add( toEntity( countryDTO ) );
        }

        return list;
    }

    @Override
    public List<CountryDTO> toDtos(List<Country> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CountryDTO> list = new ArrayList<CountryDTO>( entities.size() );
        for ( Country country : entities ) {
            list.add( toDto( country ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Country entity, CountryDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getName() != null ) {
            entity.setName( dto.getName() );
        }
    }
}
