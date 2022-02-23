package com.example.travel.mapper;

import com.example.travel.dto.PersonDTO;
import com.example.travel.dto.VehicleDTO;
import com.example.travel.entity.Person;
import com.example.travel.entity.Vehicle;
import org.mapstruct.Mapper;
import org.springframework.jmx.export.annotation.ManagedAttribute;

import java.util.List;

//@Mapper(componentModel = "spring")//,uses=BaseMapper.class
public interface PersonMapper {//extends BaseMapper
    Person toPersonEntity(PersonDTO dto);
    PersonDTO toPersonDTO(Person person);
    List<Person> toPersonEntities(List<PersonDTO> dtos);
    List<PersonDTO> toPersonDTOs(List<Person> entites);
}
