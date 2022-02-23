package com.example.travel.service;

import com.example.travel.entity.City;
import com.example.travel.entity.Company;
import com.example.travel.repository.CompanyRepository;
import com.example.travel.service.iservice.IService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService implements IService<Company>{
    private CompanyRepository repo;
    @Qualifier("cityService")
    private IService<City> cityService;

    public CompanyService(CompanyRepository repo, IService<City> cityService) {
        this.repo = repo;
        this.cityService = cityService;
    }

    @Override
    public Company save(Long parentId, Company object) {
        City city=cityService.findById(parentId);
        object.setCity(city);
        return repo.save(object);
    }

    @Override
    public Company save(Long parentOneId, Long parentTwoId, Company object) {
        return null;
    }

    @Override
    public Company save(Long parentOneId, Long parentTwoId, Long parentThreeId, Company object) {
        return null;
    }

    @Override
    public Company save(Company object) {
        return null;
    }

    @Override
    public List<Company> findByParentId(Long parentId) {
        City city=cityService.findById(parentId);
        return repo.findAllByCity(city);
    }

    @Override
    public List<Company> findByTwoParentId(Long parentOneId, Long parentTwoId) {
        return null;
    }

    @Override
    public Company findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Company> getAll() {
        return (List<Company>)repo.findAll();
    }
}
