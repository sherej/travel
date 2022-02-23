package com.example.travel.service;

import com.example.travel.entity.Airplane;
import com.example.travel.entity.Bus;
import com.example.travel.entity.Company;
import com.example.travel.repository.AirplaneRepository;
import com.example.travel.repository.BusRepository;
import com.example.travel.service.iservice.IService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService implements IService<Bus>{
    @Qualifier("companyService")
    private IService<Company> companyService;
    private BusRepository repo;


    public BusService(IService<Company> companyService, BusRepository repo) {
        this.companyService = companyService;
        this.repo = repo;
    }

    @Override
    public Bus save(Long parentId, Bus object) {
        Company company = companyService.findById(parentId);
        object.setOwner(company);
        return repo.save(object);
    }

    @Override
    public Bus save(Long parentOneId, Long parentTwoId, Bus object) {
        return null;
    }

    @Override
    public Bus save(Long parentOneId, Long parentTwoId, Long parentThreeId, Bus object) {
        return null;
    }

    @Override
    public Bus save(Bus object) {
        return null;
    }

    @Override
    public List<Bus> findByParentId(Long parentId) {
        Company company=companyService.findById(parentId);

        return repo.findAllByOwner(company);
    }

    @Override
    public List<Bus> findByTwoParentId(Long parentOneId, Long parentTwoId) {
        return null;
    }

    @Override
    public Bus findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Bus> getAll() {

        return (List<Bus>)repo.findAll();
    }
}
