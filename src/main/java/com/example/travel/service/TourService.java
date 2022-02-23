package com.example.travel.service;

import com.example.travel.entity.City;
import com.example.travel.entity.Company;
import com.example.travel.entity.Tour;
import com.example.travel.repository.TourRepository;
import com.example.travel.service.iservice.IService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourService implements IService<Tour>{

    private TourRepository repo;
    @Qualifier("cityService")
    private IService<City> cityService;
    @Qualifier("companyService")
    private IService<Company> companyService;

    public TourService(TourRepository repo, IService<City> cityService, IService<Company> companyService) {
        this.repo = repo;
        this.cityService = cityService;
        this.companyService = companyService;
    }

    @Override
    public Tour save(Long parentId, Tour object) {
        return null;
    }

    @Override
    public Tour save(Long organizerId, Long cityId, Tour object) {
        City city=cityService.findById(cityId);
        Company organizer=companyService.findById(organizerId);
        object=new Tour();
        object.setCity(city);
        object.setOrganizer(organizer);
        return repo.save(object);
    }

    @Override
    public Tour save(Long parentOneId, Long parentTwoId, Long parentThreeId, Tour object) {
        return null;
    }

    @Override
    public Tour save(Tour object) {
        return null;
    }

    @Override
    public List<Tour> findByParentId(Long parentId) {

        return null;
    }

    @Override
    public List<Tour> findByTwoParentId(Long cityId, Long organizerId) {
        City city=cityService.findById(cityId);
        Company organizer=companyService.findById(organizerId);
        return repo.findByCityAndOrganizer(city,organizer);
    }

    @Override
    public Tour findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Tour> getAll() {
        return (List<Tour>) repo.findAll();
    }
}
