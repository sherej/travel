package com.example.travel.mapper;

import com.example.travel.dto.CityDTO;
import com.example.travel.dto.CompanyDTO;
import com.example.travel.dto.VehicleDTO;
import com.example.travel.entity.City;
import com.example.travel.entity.Company;
import com.example.travel.entity.Vehicle;
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
public class VehicleMapperImpl implements VehicleMapper {

    @Override
    public Vehicle toEntity(VehicleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Vehicle vehicle = new Vehicle();

        vehicle.setModelName( dto.getModelName() );
        vehicle.setCapacity( dto.getCapacity() );
        vehicle.setOwner( companyDTOToCompany( dto.getOwner() ) );

        return vehicle;
    }

    @Override
    public VehicleDTO toDto(Vehicle entity) {
        if ( entity == null ) {
            return null;
        }

        VehicleDTO vehicleDTO = new VehicleDTO();

        vehicleDTO.setModelName( entity.getModelName() );
        vehicleDTO.setCapacity( entity.getCapacity() );
        vehicleDTO.setOwner( companyToCompanyDTO( entity.getOwner() ) );

        return vehicleDTO;
    }

    @Override
    public List<Vehicle> toEntities(List<VehicleDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Vehicle> list = new ArrayList<Vehicle>( dtos.size() );
        for ( VehicleDTO vehicleDTO : dtos ) {
            list.add( toEntity( vehicleDTO ) );
        }

        return list;
    }

    @Override
    public List<VehicleDTO> toDtos(List<Vehicle> entities) {
        if ( entities == null ) {
            return null;
        }

        List<VehicleDTO> list = new ArrayList<VehicleDTO>( entities.size() );
        for ( Vehicle vehicle : entities ) {
            list.add( toDto( vehicle ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Vehicle entity, VehicleDTO dto) {
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
