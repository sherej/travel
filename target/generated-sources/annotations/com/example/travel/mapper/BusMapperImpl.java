package com.example.travel.mapper;

import com.example.travel.dto.BusDTO;
import com.example.travel.dto.CityDTO;
import com.example.travel.dto.CompanyDTO;
import com.example.travel.entity.Bus;
import com.example.travel.entity.City;
import com.example.travel.entity.Company;
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
public class BusMapperImpl implements BusMapper {

    @Override
    public Bus toEntity(BusDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Bus bus = new Bus();

        bus.setModelName( dto.getModelName() );
        bus.setCapacity( dto.getCapacity() );
        bus.setOwner( companyDTOToCompany( dto.getOwner() ) );

        return bus;
    }

    @Override
    public BusDTO toDto(Bus entity) {
        if ( entity == null ) {
            return null;
        }

        BusDTO busDTO = new BusDTO();

        busDTO.setModelName( entity.getModelName() );
        busDTO.setCapacity( entity.getCapacity() );
        busDTO.setOwner( companyToCompanyDTO( entity.getOwner() ) );

        return busDTO;
    }

    @Override
    public List<Bus> toEntities(List<BusDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Bus> list = new ArrayList<Bus>( dtos.size() );
        for ( BusDTO busDTO : dtos ) {
            list.add( toEntity( busDTO ) );
        }

        return list;
    }

    @Override
    public List<BusDTO> toDtos(List<Bus> entities) {
        if ( entities == null ) {
            return null;
        }

        List<BusDTO> list = new ArrayList<BusDTO>( entities.size() );
        for ( Bus bus : entities ) {
            list.add( toDto( bus ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Bus entity, BusDTO dto) {
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
