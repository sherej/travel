package com.example.travel.mapper;

import com.example.travel.common.BaseMapper;
import com.example.travel.dto.HotelDTO;
import com.example.travel.dto.PaymentDTO;
import com.example.travel.entity.Hotel;
import com.example.travel.entity.Payment;
import com.example.travel.entity.User;
//import com.example.travel.mapper.BaseMapper;
import com.example.travel.mapper.CityMapper;
import com.example.travel.mapper.UserMapper;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",uses = { UserMapper.class})
public interface PaymentMapper extends BaseMapper<Payment,PaymentDTO> {

@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget Payment entity,PaymentDTO  dto);
//    Payment toEntity(PaymentDTO dto);
//    PaymentDTO toDTO(Payment entity);
//    List<Payment> toEntities(List<PaymentDTO> dtos);
//    List<PaymentDTO> toDTOs(List<Payment> entites);
}
