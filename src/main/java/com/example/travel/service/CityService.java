package com.example.travel.service;

import com.example.travel.entity.City;
import com.example.travel.entity.Country;
import com.example.travel.repository.CityRepository;
import com.example.travel.service.iservice.IService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService implements IService<City>{

    private CityRepository repo;
    @Qualifier("countryService")
    private IService<Country> countryService;

    public CityService(CityRepository repo, IService<Country> countryService) {
        this.repo = repo;
        this.countryService = countryService;
    }

    @Override
    public City save(Long parentId, City object) {
        Country country=countryService.findById(parentId);
        object.setCountry(country);
        return repo.save(object);
    }

    @Override
    public City save(Long parentOneId, Long parentTwoId, City object) {
        return null;
    }

    @Override
    public City save(Long parentOneId, Long parentTwoId, Long parentThreeId, City object) {
        return null;
    }

    @Override
    public City save(City object) {
        return null;
    }

    @Override
    public List<City> findByParentId(Long parentId) {
        Country country=countryService.findById(parentId);
        return repo.findAllByCountry(country);
    }

    @Override
    public List<City> findByTwoParentId(Long parentOneId, Long parentTwoId) {
        return null;
    }

    @Override
    public City findById(Long id) {
//        Optional<City> byId = repo.findById(id);
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<City> getAll() {
        return (List<City>)repo.findAll();
    }
}
