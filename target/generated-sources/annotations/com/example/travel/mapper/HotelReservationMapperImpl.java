package com.example.travel.mapper;

import com.example.travel.dto.HotelReservationDTO;
import com.example.travel.entity.HotelReservation;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-27T17:47:42+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class HotelReservationMapperImpl implements HotelReservationMapper {

    @Override
    public HotelReservation toEntity(HotelReservationDTO dto) {
        if ( dto == null ) {
            return null;
        }

        HotelReservation hotelReservation = new HotelReservation();

        hotelReservation.setOrderingUser( dto.getOrderingUser() );
        hotelReservation.setPayment( dto.getPayment() );
        hotelReservation.setFromDate( dto.getFromDate() );
        hotelReservation.setToDate( dto.getToDate() );

        return hotelReservation;
    }

    @Override
    public HotelReservationDTO toDto(HotelReservation entity) {
        if ( entity == null ) {
            return null;
        }

        HotelReservationDTO hotelReservationDTO = new HotelReservationDTO();

        hotelReservationDTO.setOrderingUser( entity.getOrderingUser() );
        hotelReservationDTO.setPayment( entity.getPayment() );
        hotelReservationDTO.setFromDate( entity.getFromDate() );
        hotelReservationDTO.setToDate( entity.getToDate() );

        return hotelReservationDTO;
    }

    @Override
    public List<HotelReservation> toEntities(List<HotelReservationDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<HotelReservation> list = new ArrayList<HotelReservation>( dtos.size() );
        for ( HotelReservationDTO hotelReservationDTO : dtos ) {
            list.add( toEntity( hotelReservationDTO ) );
        }

        return list;
    }

    @Override
    public List<HotelReservationDTO> toDtos(List<HotelReservation> entities) {
        if ( entities == null ) {
            return null;
        }

        List<HotelReservationDTO> list = new ArrayList<HotelReservationDTO>( entities.size() );
        for ( HotelReservation hotelReservation : entities ) {
            list.add( toDto( hotelReservation ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(HotelReservation entity, HotelReservationDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getOrderingUser() != null ) {
            entity.setOrderingUser( dto.getOrderingUser() );
        }
        if ( dto.getPayment() != null ) {
            entity.setPayment( dto.getPayment() );
        }
        if ( dto.getFromDate() != null ) {
            entity.setFromDate( dto.getFromDate() );
        }
        if ( dto.getToDate() != null ) {
            entity.setToDate( dto.getToDate() );
        }
    }
}
