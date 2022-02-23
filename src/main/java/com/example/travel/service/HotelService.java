package com.example.travel.service;

import com.example.travel.entity.City;
import com.example.travel.entity.Company;
import com.example.travel.entity.Hotel;
import com.example.travel.repository.CompanyRepository;
import com.example.travel.repository.HotelRepository;
import com.example.travel.service.iservice.IService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService implements IService<Hotel>{
    private HotelRepository repo;
    @Qualifier("cityService")
    private IService<City> cityService;

    public HotelService(HotelRepository repo, IService<City> cityService) {
        this.repo = repo;
        this.cityService = cityService;
    }

    @Override
    public Hotel save(Long parentId, Hotel object) {
        City city=cityService.findById(parentId);
        object.setCity(city);
        return repo.save(object);
    }

    @Override
    public Hotel save(Long parentOneId, Long parentTwoId, Hotel object) {
        return null;
    }

    @Override
    public Hotel save(Long parentOneId, Long parentTwoId, Long parentThreeId, Hotel object) {
        return null;
    }

    @Override
    public Hotel save(Hotel object) {
        return null;
    }

    @Override
    public List<Hotel> findByParentId(Long parentId) {
        City city=cityService.findById(parentId);
        return repo.findAllByCity(city);
    }

    @Override
    public List<Hotel> findByTwoParentId(Long parentOneId, Long parentTwoId) {
        return null;
    }

    @Override
    public Hotel findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Hotel> getAll() {
        return (List<Hotel>)repo.findAll();
    }
}
