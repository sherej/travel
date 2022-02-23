package com.example.travel.service;

import com.example.travel.entity.Country;
import com.example.travel.entity.Passenger;
import com.example.travel.repository.PassengerRepository;
import com.example.travel.service.iservice.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService implements IService<Passenger> {

    private PassengerRepository repo;

    public PassengerService(PassengerRepository repo) {
        this.repo = repo;
    }

    @Override
    public Passenger save(Long parentId, Passenger object) {
        return null;
    }

    @Override
    public Passenger save(Long parentOneId, Long parentTwoId, Passenger object) {
        return null;
    }

    @Override
    public Passenger save(Long parentOneId, Long parentTwoId, Long parentThreeId, Passenger object) {
        return null;
    }

    @Override
    public Passenger save(Passenger object) {
        return repo.save(object);
    }

    @Override
    public List<Passenger> findByParentId(Long parentId) {
        return null;
    }

    @Override
    public List<Passenger> findByTwoParentId(Long parentOneId, Long parentTwoId) {
        return null;
    }

    @Override
    public Passenger findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Passenger> getAll() {
        return (List<Passenger>)repo.findAll();
    }
}
