package com.example.travel.mapper;

import com.example.travel.dto.PaymentDTO;
import com.example.travel.entity.Payment;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-27T17:47:42+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class PaymentMapperImpl implements PaymentMapper {

    @Override
    public Payment toEntity(PaymentDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Payment payment = new Payment();

        payment.setStatus( dto.getStatus() );
        payment.setTime( dto.getTime() );
        payment.setAmount( dto.getAmount() );
        payment.setPayedUser( dto.getPayedUser() );

        return payment;
    }

    @Override
    public PaymentDTO toDto(Payment entity) {
        if ( entity == null ) {
            return null;
        }

        PaymentDTO paymentDTO = new PaymentDTO();

        paymentDTO.setStatus( entity.getStatus() );
        paymentDTO.setTime( entity.getTime() );
        paymentDTO.setPayedUser( entity.getPayedUser() );
        paymentDTO.setAmount( entity.getAmount() );

        return paymentDTO;
    }

    @Override
    public List<Payment> toEntities(List<PaymentDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Payment> list = new ArrayList<Payment>( dtos.size() );
        for ( PaymentDTO paymentDTO : dtos ) {
            list.add( toEntity( paymentDTO ) );
        }

        return list;
    }

    @Override
    public List<PaymentDTO> toDtos(List<Payment> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PaymentDTO> list = new ArrayList<PaymentDTO>( entities.size() );
        for ( Payment payment : entities ) {
            list.add( toDto( payment ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Payment entity, PaymentDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getStatus() != null ) {
            entity.setStatus( dto.getStatus() );
        }
        if ( dto.getTime() != null ) {
            entity.setTime( dto.getTime() );
        }
        if ( dto.getAmount() != null ) {
            entity.setAmount( dto.getAmount() );
        }
        if ( dto.getPayedUser() != null ) {
            entity.setPayedUser( dto.getPayedUser() );
        }
    }
}
