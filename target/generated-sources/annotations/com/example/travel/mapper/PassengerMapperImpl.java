package com.example.travel.mapper;

import com.example.travel.dto.PassengerDTO;
import com.example.travel.entity.Passenger;
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
public class PassengerMapperImpl implements PassengerMapper {

    @Override
    public Passenger toEntity(PassengerDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Passenger passenger = new Passenger();

        passenger.setFirstName( dto.getFirstName() );
        passenger.setLastName( dto.getLastName() );
        passenger.setNationalCode( dto.getNationalCode() );
        passenger.setBirthDay( dto.getBirthDay() );
        passenger.setGender( dto.getGender() );

        return passenger;
    }

    @Override
    public PassengerDTO toDto(Passenger entity) {
        if ( entity == null ) {
            return null;
        }

        PassengerDTO passengerDTO = new PassengerDTO();

        passengerDTO.setFirstName( entity.getFirstName() );
        passengerDTO.setLastName( entity.getLastName() );
        passengerDTO.setNationalCode( entity.getNationalCode() );
        passengerDTO.setBirthDay( entity.getBirthDay() );
        passengerDTO.setGender( entity.getGender() );

        return passengerDTO;
    }

    @Override
    public List<Passenger> toEntities(List<PassengerDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Passenger> list = new ArrayList<Passenger>( dtos.size() );
        for ( PassengerDTO passengerDTO : dtos ) {
            list.add( toEntity( passengerDTO ) );
        }

        return list;
    }

    @Override
    public List<PassengerDTO> toDtos(List<Passenger> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PassengerDTO> list = new ArrayList<PassengerDTO>( entities.size() );
        for ( Passenger passenger : entities ) {
            list.add( toDto( passenger ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Passenger entity, PassengerDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getFirstName() != null ) {
            entity.setFirstName( dto.getFirstName() );
        }
        if ( dto.getLastName() != null ) {
            entity.setLastName( dto.getLastName() );
        }
        if ( dto.getNationalCode() != null ) {
            entity.setNationalCode( dto.getNationalCode() );
        }
        if ( dto.getBirthDay() != null ) {
            entity.setBirthDay( dto.getBirthDay() );
        }
        if ( dto.getGender() != null ) {
            entity.setGender( dto.getGender() );
        }
    }
}
