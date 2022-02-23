package com.example.travel.mapper;

import com.example.travel.dto.RoomDTO;
import com.example.travel.dto.TerminalDTO;
import com.example.travel.entity.Room;
import com.example.travel.entity.Terminal;
import org.mapstruct.Mapper;

import java.util.List;

//@Mapper(componentModel = "spring",uses = {CityMapper.class})//BaseMapper.class,
public interface TerminalMapper {//extends BaseMapper
    Terminal toEntity(TerminalDTO dto);
    TerminalDTO toDTO(Terminal entity);
    List<Terminal> toEntities(List<TerminalDTO> dtos);
    List<TerminalDTO> toDTOs(List<Terminal> entites);
}
