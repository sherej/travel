package com.example.travel.mapper;

import com.example.travel.dto.PersonDTO;
import com.example.travel.entity.Person;
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
public class PersonMapperImpl implements PersonMapper {

    @Override
    public Person toEntity(PersonDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Person person = new Person();

        person.setFirstName( dto.getFirstName() );
        person.setLastName( dto.getLastName() );
        person.setNationalCode( dto.getNationalCode() );
        person.setBirthDay( dto.getBirthDay() );
        person.setGender( dto.getGender() );

        return person;
    }

    @Override
    public PersonDTO toDto(Person entity) {
        if ( entity == null ) {
            return null;
        }

        PersonDTO personDTO = new PersonDTO();

        personDTO.setFirstName( entity.getFirstName() );
        personDTO.setLastName( entity.getLastName() );
        personDTO.setNationalCode( entity.getNationalCode() );
        personDTO.setBirthDay( entity.getBirthDay() );
        personDTO.setGender( entity.getGender() );

        return personDTO;
    }

    @Override
    public List<Person> toEntities(List<PersonDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Person> list = new ArrayList<Person>( dtos.size() );
        for ( PersonDTO personDTO : dtos ) {
            list.add( toEntity( personDTO ) );
        }

        return list;
    }

    @Override
    public List<PersonDTO> toDtos(List<Person> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PersonDTO> list = new ArrayList<PersonDTO>( entities.size() );
        for ( Person person : entities ) {
            list.add( toDto( person ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Person entity, PersonDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getFirstName() != null ) {
            entity.setFirstName( dto.getFirstName() );
        }
        if ( dto.getLastName() != null ) {
            entity.setLastName( dto.getLastName() );
        }
        if ( dto.getNationalCode() != null ) {
            entity.setNationalCode( dto.getNationalCode() );
        }
        if ( dto.getBirthDay() != null ) {
            entity.setBirthDay( dto.getBirthDay() );
        }
        if ( dto.getGender() != null ) {
            entity.setGender( dto.getGender() );
        }
    }
}
