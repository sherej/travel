package com.example.travel.mapper;

import com.example.travel.common.BaseMapper;
import com.example.travel.dto.RoomDTO;
import com.example.travel.dto.TerminalDTO;
import com.example.travel.entity.Room;
import com.example.travel.entity.Terminal;
//import com.example.travel.training.ToSource;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring",uses = {CityMapper.class})
public interface TerminalMapper extends BaseMapper<Terminal,TerminalDTO> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget Terminal entity,TerminalDTO dto);

//    @Mapping(target = "source",qualifiedBy = ToSource.class)
//    Terminal toSource(TerminalDTO dto);
//    @Mapping(target = "destination",qualifiedBy = ToSource.class)
//    Terminal toDestination(TerminalDTO dto);

//    Terminal toEntity(TerminalDTO dto);
//    TerminalDTO toDTO(Terminal entity);
//    List<Terminal> toEntities(List<TerminalDTO> dtos);
//    List<TerminalDTO> toDTOs(List<Terminal> entites);
}
