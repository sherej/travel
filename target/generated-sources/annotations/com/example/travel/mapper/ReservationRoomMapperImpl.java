package com.example.travel.mapper;

import com.example.travel.dto.ReservationRoomDTO;
import com.example.travel.entity.HotelReservation;
import com.example.travel.entity.ReservationRoom;
import com.example.travel.entity.Room;
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
public class ReservationRoomMapperImpl implements ReservationRoomMapper {

    @Autowired
    private HotelReservationMapper hotelReservationMapper;
    @Autowired
    private RoomMapper roomMapper;

    @Override
    public ReservationRoom toEntity(ReservationRoomDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ReservationRoom reservationRoom = new ReservationRoom();

        reservationRoom.setHotelReservation( hotelReservationMapper.toEntity( dto.getHotelReservation() ) );
        reservationRoom.setRoom( roomMapper.toEntity( dto.getRoom() ) );

        return reservationRoom;
    }

    @Override
    public ReservationRoomDTO toDto(ReservationRoom entity) {
        if ( entity == null ) {
            return null;
        }

        ReservationRoomDTO reservationRoomDTO = new ReservationRoomDTO();

        reservationRoomDTO.setHotelReservation( hotelReservationMapper.toDto( entity.getHotelReservation() ) );
        reservationRoomDTO.setRoom( roomMapper.toDto( entity.getRoom() ) );

        return reservationRoomDTO;
    }

    @Override
    public List<ReservationRoom> toEntities(List<ReservationRoomDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<ReservationRoom> list = new ArrayList<ReservationRoom>( dtos.size() );
        for ( ReservationRoomDTO reservationRoomDTO : dtos ) {
            list.add( toEntity( reservationRoomDTO ) );
        }

        return list;
    }

    @Override
    public List<ReservationRoomDTO> toDtos(List<ReservationRoom> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ReservationRoomDTO> list = new ArrayList<ReservationRoomDTO>( entities.size() );
        for ( ReservationRoom reservationRoom : entities ) {
            list.add( toDto( reservationRoom ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(ReservationRoom entity, ReservationRoomDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getHotelReservation() != null ) {
            if ( entity.getHotelReservation() == null ) {
                entity.setHotelReservation( new HotelReservation() );
            }
            hotelReservationMapper.partialUpdate( entity.getHotelReservation(), dto.getHotelReservation() );
        }
        if ( dto.getRoom() != null ) {
            if ( entity.getRoom() == null ) {
                entity.setRoom( new Room() );
            }
            roomMapper.partialUpdate( entity.getRoom(), dto.getRoom() );
        }
    }
}
