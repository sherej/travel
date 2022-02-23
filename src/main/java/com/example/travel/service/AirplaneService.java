package com.example.travel.service;

import com.example.travel.entity.Airplane;
import com.example.travel.entity.Company;
import com.example.travel.repository.AirplaneRepository;
import com.example.travel.service.iservice.IService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirplaneService implements IService<Airplane> {
    @Qualifier("companyService")
    private IService<Company> companyService;
    private AirplaneRepository repo;


    public AirplaneService(IService<Company> companyService, AirplaneRepository repo) {
        this.companyService = companyService;
        this.repo = repo;
    }

    @Override
    public Airplane save(Long parentId, Airplane object) {
        Company company = companyService.findById(parentId);
        object.setOwner(company);
        return repo.save(object);
    }

    @Override
    public Airplane save(Long parentOneId, Long parentTwoId, Airplane object) {
        return null;
    }

    @Override
    public Airplane save(Long parentOneId, Long parentTwoId, Long parentThreeId, Airplane object) {
        return null;
    }

    @Override
    public Airplane save(Airplane object) {
        return null;
    }

    @Override
    public List<Airplane> findByParentId(Long parentId) {
        Company company=companyService.findById(parentId);

        return repo.findAllByOwner(company);
    }

    @Override
    public List<Airplane> findByTwoParentId(Long parentOneId, Long parentTwoId) {
        return null;
    }

    @Override
    public Airplane findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Airplane> getAll() {

        return (List<Airplane>)repo.findAll();
    }
}
