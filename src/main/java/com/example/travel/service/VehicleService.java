package com.example.travel.service;

import com.example.travel.entity.Airplane;
import com.example.travel.entity.Company;
import com.example.travel.entity.Vehicle;
import com.example.travel.repository.AirplaneRepository;
import com.example.travel.repository.VehicleRepository;
import com.example.travel.service.iservice.IService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService implements IService<Vehicle> {
    private VehicleRepository repo;
    @Qualifier("companyService")
    private IService<Company> companyService;



    public VehicleService(IService<Company> companyService, VehicleRepository repo) {
        this.companyService = companyService;
        this.repo = repo;
    }

    @Override
    public Vehicle save(Long companyId, Vehicle object) {
        Company company = companyService.findById(companyId);
        object.setOwner(company);
        return repo.save(object);
    }

    @Override
    public Vehicle save(Long parentOneId, Long parentTwoId, Vehicle object) {
        return null;
    }

    @Override
    public Vehicle save(Long parentOneId, Long parentTwoId, Long parentThreeId, Vehicle object) {
        return null;
    }

    @Override
    public Vehicle save(Vehicle object) {
        return null;
    }

    @Override
    public List<Vehicle> findByParentId(Long parentId) {
        Company company=companyService.findById(parentId);

        return repo.findAllByOwner(company);
    }

    @Override
    public List<Vehicle> findByTwoParentId(Long parentOneId, Long parentTwoId) {
        return null;
    }

    @Override
    public Vehicle findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Vehicle> getAll() {

        return (List<Vehicle>)repo.findAll();
    }
}
