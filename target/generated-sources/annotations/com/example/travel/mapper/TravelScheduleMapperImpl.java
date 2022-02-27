package com.example.travel.mapper;

import com.example.travel.dto.TravelScheduleDTO;
import com.example.travel.entity.Terminal;
import com.example.travel.entity.TravelSchedule;
import com.example.travel.entity.Vehicle;
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
public class TravelScheduleMapperImpl implements TravelScheduleMapper {

    @Autowired
    private TerminalMapper terminalMapper;
    @Autowired
    private VehicleMapper vehicleMapper;

    @Override
    public TravelSchedule toEntity(TravelScheduleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TravelSchedule travelSchedule = new TravelSchedule();

        travelSchedule.setVehicle( vehicleMapper.toEntity( dto.getVehicle() ) );
        travelSchedule.setDepartureTime( dto.getDepartureTime() );
        travelSchedule.setSource( terminalMapper.toEntity( dto.getSource() ) );
        travelSchedule.setDestination( terminalMapper.toEntity( dto.getDestination() ) );

        return travelSchedule;
    }

    @Override
    public TravelScheduleDTO toDto(TravelSchedule entity) {
        if ( entity == null ) {
            return null;
        }

        TravelScheduleDTO travelScheduleDTO = new TravelScheduleDTO();

        travelScheduleDTO.setVehicle( vehicleMapper.toDto( entity.getVehicle() ) );
        travelScheduleDTO.setSource( terminalMapper.toDto( entity.getSource() ) );
        travelScheduleDTO.setDestination( terminalMapper.toDto( entity.getDestination() ) );
        travelScheduleDTO.setDepartureTime( entity.getDepartureTime() );

        return travelScheduleDTO;
    }

    @Override
    public List<TravelSchedule> toEntities(List<TravelScheduleDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<TravelSchedule> list = new ArrayList<TravelSchedule>( dtos.size() );
        for ( TravelScheduleDTO travelScheduleDTO : dtos ) {
            list.add( toEntity( travelScheduleDTO ) );
        }

        return list;
    }

    @Override
    public List<TravelScheduleDTO> toDtos(List<TravelSchedule> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TravelScheduleDTO> list = new ArrayList<TravelScheduleDTO>( entities.size() );
        for ( TravelSchedule travelSchedule : entities ) {
            list.add( toDto( travelSchedule ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(TravelSchedule entity, TravelScheduleDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getVehicle() != null ) {
            if ( entity.getVehicle() == null ) {
                entity.setVehicle( new Vehicle() );
            }
            vehicleMapper.partialUpdate( entity.getVehicle(), dto.getVehicle() );
        }
        if ( dto.getDepartureTime() != null ) {
            entity.setDepartureTime( dto.getDepartureTime() );
        }
        if ( dto.getSource() != null ) {
            if ( entity.getSource() == null ) {
                entity.setSource( new Terminal() );
            }
            terminalMapper.partialUpdate( entity.getSource(), dto.getSource() );
        }
        if ( dto.getDestination() != null ) {
            if ( entity.getDestination() == null ) {
                entity.setDestination( new Terminal() );
            }
            terminalMapper.partialUpdate( entity.getDestination(), dto.getDestination() );
        }
    }
}
