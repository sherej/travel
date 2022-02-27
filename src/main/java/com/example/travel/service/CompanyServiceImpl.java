package com.example.travel.service;

import com.example.travel.common.BaseMapper;
import com.example.travel.common.BaseRepository;
import com.example.travel.common.BaseServiceImpl;
import com.example.travel.dto.CompanyDTO;
import com.example.travel.entity.Company;
import com.example.travel.mapper.CompanyMapper;
import com.example.travel.repository.CompanyRepository;
import com.example.travel.service.iservice.CompanyService;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl extends BaseServiceImpl<Company, CompanyDTO,Long> implements CompanyService {
    private final CompanyRepository repo;

    private final CompanyMapper mapper;

    public CompanyServiceImpl(CompanyRepository repo,CompanyMapper  mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    protected BaseRepository<Company, Long> getRepo() {
        return repo;
    }

    @Override
    protected BaseMapper<Company, CompanyDTO> getMapper() {
        return mapper;
    }

}
