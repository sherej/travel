package com.example.travel.mapper;

import com.example.travel.dto.ReservationGuestDTO;
import com.example.travel.entity.HotelReservation;
import com.example.travel.entity.Passenger;
import com.example.travel.entity.ReservationGuest;
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
public class ReservationGuestMapperImpl implements ReservationGuestMapper {

    @Autowired
    private HotelReservationMapper hotelReservationMapper;
    @Autowired
    private PassengerMapper passengerMapper;

    @Override
    public ReservationGuest toEntity(ReservationGuestDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ReservationGuest reservationGuest = new ReservationGuest();

        reservationGuest.setHotelReservation( hotelReservationMapper.toEntity( dto.getHotelReservation() ) );
        reservationGuest.setGuest( passengerMapper.toEntity( dto.getGuest() ) );

        return reservationGuest;
    }

    @Override
    public ReservationGuestDTO toDto(ReservationGuest entity) {
        if ( entity == null ) {
            return null;
        }

        ReservationGuestDTO reservationGuestDTO = new ReservationGuestDTO();

        reservationGuestDTO.setHotelReservation( hotelReservationMapper.toDto( entity.getHotelReservation() ) );
        reservationGuestDTO.setGuest( passengerMapper.toDto( entity.getGuest() ) );

        return reservationGuestDTO;
    }

    @Override
    public List<ReservationGuest> toEntities(List<ReservationGuestDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<ReservationGuest> list = new ArrayList<ReservationGuest>( dtos.size() );
        for ( ReservationGuestDTO reservationGuestDTO : dtos ) {
            list.add( toEntity( reservationGuestDTO ) );
        }

        return list;
    }

    @Override
    public List<ReservationGuestDTO> toDtos(List<ReservationGuest> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ReservationGuestDTO> list = new ArrayList<ReservationGuestDTO>( entities.size() );
        for ( ReservationGuest reservationGuest : entities ) {
            list.add( toDto( reservationGuest ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(ReservationGuest entity, ReservationGuestDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getHotelReservation() != null ) {
            if ( entity.getHotelReservation() == null ) {
                entity.setHotelReservation( new HotelReservation() );
            }
            hotelReservationMapper.partialUpdate( entity.getHotelReservation(), dto.getHotelReservation() );
        }
        if ( dto.getGuest() != null ) {
            if ( entity.getGuest() == null ) {
                entity.setGuest( new Passenger() );
            }
            passengerMapper.partialUpdate( entity.getGuest(), dto.getGuest() );
        }
    }
}
