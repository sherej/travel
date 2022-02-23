package com.example.travel.service;

import com.example.travel.entity.City;
import com.example.travel.entity.Hotel;
import com.example.travel.entity.Terminal;
import com.example.travel.repository.HotelRepository;
import com.example.travel.repository.TerminalRepository;
import com.example.travel.service.iservice.IService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerminalService implements IService<Terminal>{
    private TerminalRepository repo;
    @Qualifier("cityService")
    private IService<City> cityService;

    public TerminalService(TerminalRepository repo, IService<City> cityService) {
        this.repo = repo;
        this.cityService = cityService;
    }

    @Override
    public Terminal save(Long parentId, Terminal object) {
        City city=cityService.findById(parentId);
        object.setCity(city);
        return repo.save(object);
    }

    @Override
    public Terminal save(Long parentOneId, Long parentTwoId, Terminal object) {
        return null;
    }

    @Override
    public Terminal save(Long parentOneId, Long parentTwoId, Long parentThreeId, Terminal object) {
        return null;
    }

    @Override
    public Terminal save(Terminal object) {
        return null;
    }

    @Override
    public List<Terminal> findByParentId(Long parentId) {
        City city=cityService.findById(parentId);
        return repo.findAllByCity(city);
    }

    @Override
    public List<Terminal> findByTwoParentId(Long parentOneId, Long parentTwoId) {
        return null;
    }

    @Override
    public Terminal findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Terminal> getAll() {
        return (List<Terminal>)repo.findAll();
    }
}
