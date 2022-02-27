package com.example.travel.mapper;

import com.example.travel.dto.CompanyDTO;
import com.example.travel.entity.City;
import com.example.travel.entity.Company;
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
public class CompanyMapperImpl implements CompanyMapper {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public Company toEntity(CompanyDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Company company = new Company();

        company.setName( dto.getName() );
        company.setCity( cityMapper.toEntity( dto.getCity() ) );
        company.setType( dto.getType() );
        company.setAddress( dto.getAddress() );

        return company;
    }

    @Override
    public CompanyDTO toDto(Company entity) {
        if ( entity == null ) {
            return null;
        }

        CompanyDTO companyDTO = new CompanyDTO();

        companyDTO.setName( entity.getName() );
        companyDTO.setType( entity.getType() );
        companyDTO.setCity( cityMapper.toDto( entity.getCity() ) );
        companyDTO.setAddress( entity.getAddress() );

        return companyDTO;
    }

    @Override
    public List<Company> toEntities(List<CompanyDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Company> list = new ArrayList<Company>( dtos.size() );
        for ( CompanyDTO companyDTO : dtos ) {
            list.add( toEntity( companyDTO ) );
        }

        return list;
    }

    @Override
    public List<CompanyDTO> toDtos(List<Company> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CompanyDTO> list = new ArrayList<CompanyDTO>( entities.size() );
        for ( Company company : entities ) {
            list.add( toDto( company ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Company entity, CompanyDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getName() != null ) {
            entity.setName( dto.getName() );
        }
        if ( dto.getCity() != null ) {
            if ( entity.getCity() == null ) {
                entity.setCity( new City() );
            }
            cityMapper.partialUpdate( entity.getCity(), dto.getCity() );
        }
        if ( dto.getType() != null ) {
            entity.setType( dto.getType() );
        }
        if ( dto.getAddress() != null ) {
            entity.setAddress( dto.getAddress() );
        }
    }
}
