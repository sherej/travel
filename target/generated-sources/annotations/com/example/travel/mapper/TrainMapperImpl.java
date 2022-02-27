package com.example.travel.mapper;

import com.example.travel.dto.CityDTO;
import com.example.travel.dto.CompanyDTO;
import com.example.travel.dto.TrainDTO;
import com.example.travel.entity.City;
import com.example.travel.entity.Company;
import com.example.travel.entity.Train;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-27T17:47:43+0330",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class TrainMapperImpl implements TrainMapper {

    @Override
    public Train toEntity(TrainDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Train train = new Train();

        train.setModelName( dto.getModelName() );
        train.setCapacity( dto.getCapacity() );
        train.setOwner( companyDTOToCompany( dto.getOwner() ) );

        return train;
    }

    @Override
    public TrainDTO toDto(Train entity) {
        if ( entity == null ) {
            return null;
        }

        TrainDTO trainDTO = new TrainDTO();

        trainDTO.setModelName( entity.getModelName() );
        trainDTO.setCapacity( entity.getCapacity() );
        trainDTO.setOwner( companyToCompanyDTO( entity.getOwner() ) );

        return trainDTO;
    }

    @Override
    public List<Train> toEntities(List<TrainDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Train> list = new ArrayList<Train>( dtos.size() );
        for ( TrainDTO trainDTO : dtos ) {
            list.add( toEntity( trainDTO ) );
        }

        return list;
    }

    @Override
    public List<TrainDTO> toDtos(List<Train> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TrainDTO> list = new ArrayList<TrainDTO>( entities.size() );
        for ( Train train : entities ) {
            list.add( toDto( train ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Train entity, TrainDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getModelName() != null ) {
            entity.setModelName( dto.getModelName() );
        }
        entity.setCapacity( dto.getCapacity() );
        if ( dto.getOwner() != null ) {
            if ( entity.getOwner() == null ) {
                entity.setOwner( new Company() );
            }
            companyDTOToCompany1( dto.getOwner(), entity.getOwner() );
        }
    }

    protected City cityDTOToCity(CityDTO cityDTO) {
        if ( cityDTO == null ) {
            return null;
        }

        City city = new City();

        city.setName( cityDTO.getName() );
        city.setCountry( cityDTO.getCountry() );

        return city;
    }

    protected Company companyDTOToCompany(CompanyDTO companyDTO) {
        if ( companyDTO == null ) {
            return null;
        }

        Company company = new Company();

        company.setName( companyDTO.getName() );
        company.setCity( cityDTOToCity( companyDTO.getCity() ) );
        company.setType( companyDTO.getType() );
        company.setAddress( companyDTO.getAddress() );

        return company;
    }

    protected CityDTO cityToCityDTO(City city) {
        if ( city == null ) {
            return null;
        }

        CityDTO cityDTO = new CityDTO();

        cityDTO.setName( city.getName() );
        cityDTO.setCountry( city.getCountry() );

        return cityDTO;
    }

    protected CompanyDTO companyToCompanyDTO(Company company) {
        if ( company == null ) {
            return null;
        }

        CompanyDTO companyDTO = new CompanyDTO();

        companyDTO.setName( company.getName() );
        companyDTO.setType( company.getType() );
        companyDTO.setCity( cityToCityDTO( company.getCity() ) );
        companyDTO.setAddress( company.getAddress() );

        return companyDTO;
    }

    protected void cityDTOToCity1(CityDTO cityDTO, City mappingTarget) {
        if ( cityDTO == null ) {
            return;
        }

        if ( cityDTO.getName() != null ) {
            mappingTarget.setName( cityDTO.getName() );
        }
        if ( cityDTO.getCountry() != null ) {
            mappingTarget.setCountry( cityDTO.getCountry() );
        }
    }

    protected void companyDTOToCompany1(CompanyDTO companyDTO, Company mappingTarget) {
        if ( companyDTO == null ) {
            return;
        }

        if ( companyDTO.getName() != null ) {
            mappingTarget.setName( companyDTO.getName() );
        }
        if ( companyDTO.getCity() != null ) {
            if ( mappingTarget.getCity() == null ) {
                mappingTarget.setCity( new City() );
            }
            cityDTOToCity1( companyDTO.getCity(), mappingTarget.getCity() );
        }
        if ( companyDTO.getType() != null ) {
            mappingTarget.setType( companyDTO.getType() );
        }
        if ( companyDTO.getAddress() != null ) {
            mappingTarget.setAddress( companyDTO.getAddress() );
        }
    }
}
