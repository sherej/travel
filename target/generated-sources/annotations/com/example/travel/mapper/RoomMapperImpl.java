package com.example.travel.mapper;

import com.example.travel.dto.RoomDTO;
import com.example.travel.entity.Hotel;
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
public class RoomMapperImpl implements RoomMapper {

    @Autowired
    private HotelMapper hotelMapper;

    @Override
    public Room toEntity(RoomDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Room room = new Room();

        room.setGrade( dto.getGrade() );
        room.setFloor( dto.getFloor() );
        room.setFloor_count( dto.getFloor_count() );
        room.setBedCount( dto.getBedCount() );
        room.setHotel( hotelMapper.toEntity( dto.getHotel() ) );

        return room;
    }

    @Override
    public RoomDTO toDto(Room entity) {
        if ( entity == null ) {
            return null;
        }

        RoomDTO roomDTO = new RoomDTO();

        roomDTO.setGrade( entity.getGrade() );
        roomDTO.setFloor( entity.getFloor() );
        roomDTO.setFloor_count( entity.getFloor_count() );
        roomDTO.setBedCount( entity.getBedCount() );
        roomDTO.setHotel( hotelMapper.toDto( entity.getHotel() ) );

        return roomDTO;
    }

    @Override
    public List<Room> toEntities(List<RoomDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Room> list = new ArrayList<Room>( dtos.size() );
        for ( RoomDTO roomDTO : dtos ) {
            list.add( toEntity( roomDTO ) );
        }

        return list;
    }

    @Override
    public List<RoomDTO> toDtos(List<Room> entities) {
        if ( entities == null ) {
            return null;
        }

        List<RoomDTO> list = new ArrayList<RoomDTO>( entities.size() );
        for ( Room room : entities ) {
            list.add( toDto( room ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Room entity, RoomDTO dto) {
        if ( dto == null ) {
            return;
        }

        entity.setGrade( dto.getGrade() );
        if ( dto.getFloor() != null ) {
            entity.setFloor( dto.getFloor() );
        }
        if ( dto.getFloor_count() != null ) {
            entity.setFloor_count( dto.getFloor_count() );
        }
        if ( dto.getBedCount() != null ) {
            entity.setBedCount( dto.getBedCount() );
        }
        if ( dto.getHotel() != null ) {
            if ( entity.getHotel() == null ) {
                entity.setHotel( new Hotel() );
            }
            hotelMapper.partialUpdate( entity.getHotel(), dto.getHotel() );
        }
    }
}
