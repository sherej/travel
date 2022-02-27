package com.example.travel.mapper;

import com.example.travel.dto.TicketDTO;
import com.example.travel.entity.Passenger;
import com.example.travel.entity.Payment;
import com.example.travel.entity.Ticket;
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
public class TicketMapperImpl implements TicketMapper {

    @Autowired
    private PaymentMapper paymentMapper;
    @Autowired
    private PassengerMapper passengerMapper;

    @Override
    public Ticket toEntity(TicketDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Ticket ticket = new Ticket();

        ticket.setSeat( dto.getSeat() );
        ticket.setPayment( paymentMapper.toEntity( dto.getPayment() ) );
        ticket.setPassenger( passengerMapper.toEntity( dto.getPassenger() ) );

        return ticket;
    }

    @Override
    public TicketDTO toDto(Ticket entity) {
        if ( entity == null ) {
            return null;
        }

        TicketDTO ticketDTO = new TicketDTO();

        ticketDTO.setSeat( entity.getSeat() );
        ticketDTO.setPayment( paymentMapper.toDto( entity.getPayment() ) );
        ticketDTO.setPassenger( passengerMapper.toDto( entity.getPassenger() ) );

        return ticketDTO;
    }

    @Override
    public List<Ticket> toEntities(List<TicketDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Ticket> list = new ArrayList<Ticket>( dtos.size() );
        for ( TicketDTO ticketDTO : dtos ) {
            list.add( toEntity( ticketDTO ) );
        }

        return list;
    }

    @Override
    public List<TicketDTO> toDtos(List<Ticket> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TicketDTO> list = new ArrayList<TicketDTO>( entities.size() );
        for ( Ticket ticket : entities ) {
            list.add( toDto( ticket ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Ticket entity, TicketDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getSeat() != null ) {
            entity.setSeat( dto.getSeat() );
        }
        if ( dto.getPayment() != null ) {
            if ( entity.getPayment() == null ) {
                entity.setPayment( new Payment() );
            }
            paymentMapper.partialUpdate( entity.getPayment(), dto.getPayment() );
        }
        if ( dto.getPassenger() != null ) {
            if ( entity.getPassenger() == null ) {
                entity.setPassenger( new Passenger() );
            }
            passengerMapper.partialUpdate( entity.getPassenger(), dto.getPassenger() );
        }
    }
}
