package com.example.travel.service;

import com.example.travel.entity.Country;
import com.example.travel.repository.CountryRepository;
import com.example.travel.service.iservice.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService implements IService<Country> {

    private CountryRepository repo;

    public CountryService(CountryRepository repo) {
        this.repo = repo;
    }

    @Override
    public Country save(Long parentId, Country object) {

        return null;
    }

    @Override
    public Country save(Long parentOneId, Long parentTwoId, Country object) {
        return null;
    }

    @Override
    public Country save(Long parentOneId, Long parentTwoId, Long parentThreeId, Country object) {
        return null;
    }

    @Override
    public Country save(Country object) {

        return repo.save(object);
    }

    @Override
    public List<Country> findByParentId(Long parentId) {
        return null;
    }

    @Override
    public List<Country> findByTwoParentId(Long parentOneId, Long parentTwoId) {
        return null;
    }

    @Override
    public Country findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Country> getAll() {
        return (List<Country>) repo.findAll();
    }
}
