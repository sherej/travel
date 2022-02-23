package com.example.travel.service;


import com.example.travel.entity.Company;
import com.example.travel.entity.Train;

import com.example.travel.repository.TrainRepository;
import com.example.travel.service.iservice.IService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService implements IService<Train>{

    private TrainRepository repo;
    @Qualifier("companyService")
    private IService<Company> companyService;



    public TrainService(IService<Company> companyService, TrainRepository repo) {
        this.companyService = companyService;
        this.repo = repo;
    }

    @Override
    public Train save(Long parentId, Train object) {
        Company company = companyService.findById(parentId);
        object.setOwner(company);
        return repo.save(object);
    }

    @Override
    public Train save(Long parentOneId, Long parentTwoId, Train object) {
        return null;
    }

    @Override
    public Train save(Long parentOneId, Long parentTwoId, Long parentThreeId, Train object) {
        return null;
    }

    @Override
    public Train save(Train object) {
        return null;
    }

    @Override
    public List<Train> findByParentId(Long parentId) {
        Company company=companyService.findById(parentId);

        return repo.findAllByOwner(company);
    }

    @Override
    public List<Train> findByTwoParentId(Long parentOneId, Long parentTwoId) {
        return null;
    }

    @Override
    public Train findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Train> getAll() {

        return (List<Train>)repo.findAll();
    }
}
