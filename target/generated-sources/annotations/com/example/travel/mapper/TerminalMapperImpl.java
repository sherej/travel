package com.example.travel.mapper;

import com.example.travel.dto.TerminalDTO;
import com.example.travel.entity.City;
import com.example.travel.entity.Terminal;
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
public class TerminalMapperImpl implements TerminalMapper {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public Terminal toEntity(TerminalDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Terminal terminal = new Terminal();

        terminal.setName( dto.getName() );
        terminal.setType( dto.getType() );
        terminal.setCity( cityMapper.toEntity( dto.getCity() ) );
        terminal.setAddress( dto.getAddress() );

        return terminal;
    }

    @Override
    public TerminalDTO toDto(Terminal entity) {
        if ( entity == null ) {
            return null;
        }

        TerminalDTO terminalDTO = new TerminalDTO();

        terminalDTO.setName( entity.getName() );
        terminalDTO.setType( entity.getType() );
        terminalDTO.setCity( cityMapper.toDto( entity.getCity() ) );
        terminalDTO.setAddress( entity.getAddress() );

        return terminalDTO;
    }

    @Override
    public List<Terminal> toEntities(List<TerminalDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Terminal> list = new ArrayList<Terminal>( dtos.size() );
        for ( TerminalDTO terminalDTO : dtos ) {
            list.add( toEntity( terminalDTO ) );
        }

        return list;
    }

    @Override
    public List<TerminalDTO> toDtos(List<Terminal> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TerminalDTO> list = new ArrayList<TerminalDTO>( entities.size() );
        for ( Terminal terminal : entities ) {
            list.add( toDto( terminal ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Terminal entity, TerminalDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getName() != null ) {
            entity.setName( dto.getName() );
        }
        if ( dto.getType() != null ) {
            entity.setType( dto.getType() );
        }
        if ( dto.getCity() != null ) {
            if ( entity.getCity() == null ) {
                entity.setCity( new City() );
            }
            cityMapper.partialUpdate( entity.getCity(), dto.getCity() );
        }
        if ( dto.getAddress() != null ) {
            entity.setAddress( dto.getAddress() );
        }
    }
}
