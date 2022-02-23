package com.example.travel.mapper;

import com.example.travel.dto.RoomDTO;
import com.example.travel.dto.TicketDTO;
import com.example.travel.entity.Room;
import com.example.travel.entity.Ticket;
import com.example.travel.entity.TravelSchedule;
import org.mapstruct.Mapper;

import java.util.List;

//@Mapper(componentModel = "spring",uses = { TravelSchedule.class
//        , PaymentMapper.class,PassengerMapper.class})//BaseMapper.class,
public interface TicketMapper {//extends BaseMapper
    Ticket toEntity(TicketDTO dto);
    TicketDTO toDTO(Ticket entity);
    List<Ticket> toEntities(List<TicketDTO> dtos);
    List<TicketDTO> toDTOs(List<Ticket> entites);
}
