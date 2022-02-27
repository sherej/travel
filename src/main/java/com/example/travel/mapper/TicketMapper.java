package com.example.travel.mapper;

import com.example.travel.common.BaseMapper;
import com.example.travel.dto.RoomDTO;
import com.example.travel.dto.TicketDTO;
import com.example.travel.entity.Room;
import com.example.travel.entity.Ticket;
import com.example.travel.entity.TravelSchedule;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",uses = { TravelSchedule.class
        , PaymentMapper.class,PassengerMapper.class})
public interface TicketMapper extends BaseMapper<Ticket,TicketDTO> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget Ticket entity,TicketDTO dto);
//    Ticket toEntity(TicketDTO dto);
//    TicketDTO toDTO(Ticket entity);
//    List<Ticket> toEntities(List<TicketDTO> dtos);
//    List<TicketDTO> toDTOs(List<Ticket> entites);
}
