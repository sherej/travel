package com.example.travel.mapper;

import com.example.travel.dto.HotelDTO;
import com.example.travel.entity.Hotel;
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
public class HotelMapperImpl implements HotelMapper {

    @Override
    public Hotel toEntity(HotelDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Hotel hotel = new Hotel();

        hotel.setName( dto.getName() );
        hotel.setCity( dto.getCity() );
        hotel.setAddress( dto.getAddress() );
        hotel.setStars( dto.getStars() );

        return hotel;
    }

    @Override
    public HotelDTO toDto(Hotel entity) {
        if ( entity == null ) {
            return null;
        }

        HotelDTO hotelDTO = new HotelDTO();

        hotelDTO.setName( entity.getName() );
        hotelDTO.setStars( entity.getStars() );
        hotelDTO.setCity( entity.getCity() );
        hotelDTO.setAddress( entity.getAddress() );

        return hotelDTO;
    }

    @Override
    public List<Hotel> toEntities(List<HotelDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Hotel> list = new ArrayList<Hotel>( dtos.size() );
        for ( HotelDTO hotelDTO : dtos ) {
            list.add( toEntity( hotelDTO ) );
        }

        return list;
    }

    @Override
    public List<HotelDTO> toDtos(List<Hotel> entities) {
        if ( entities == null ) {
            return null;
        }

        List<HotelDTO> list = new ArrayList<HotelDTO>( entities.size() );
        for ( Hotel hotel : entities ) {
            list.add( toDto( hotel ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Hotel entity, HotelDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getName() != null ) {
            entity.setName( dto.getName() );
        }
        if ( dto.getCity() != null ) {
            entity.setCity( dto.getCity() );
        }
        if ( dto.getAddress() != null ) {
            entity.setAddress( dto.getAddress() );
        }
        if ( dto.getStars() != null ) {
            entity.setStars( dto.getStars() );
        }
    }
}
