package com.example.travel.service;

import com.example.travel.entity.Terminal;
import com.example.travel.entity.TravelSchedule;
import com.example.travel.entity.Vehicle;
import com.example.travel.repository.TravelScheduleRepository;
import com.example.travel.service.iservice.IService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelScheduleService implements IService<TravelSchedule>{

    private TravelScheduleRepository repo;
    @Qualifier("vehicleService")
    private VehicleService vehicleService;
    @Qualifier("terminalService")
    private TerminalService terminalService;

    public TravelScheduleService(TravelScheduleRepository repo, VehicleService vehicleService
            , TerminalService terminalService) {
        this.repo = repo;
        this.vehicleService = vehicleService;
        this.terminalService = terminalService;
    }

    @Override
    public TravelSchedule save(Long parentId, TravelSchedule object) {
        return null;
    }

    @Override
    public TravelSchedule save(Long parentOneId, Long parentTwoId, TravelSchedule object) {

        return null;
    }

    @Override
    public TravelSchedule save(Long vehicleId, Long sourceId, Long destinationId, TravelSchedule travelSchedule) {
        Vehicle vehicle=vehicleService.findById(vehicleId);
        Terminal source=terminalService.findById(sourceId);
        Terminal destination=terminalService.findById(destinationId);
        travelSchedule.setVehicle(vehicle);
        travelSchedule.setSource(source);
//        travelSchedule.setDestination(destination);

        return repo.save(travelSchedule);
    }

    @Override
    public TravelSchedule save(TravelSchedule object) {
        return null;
    }

    @Override
    public List<TravelSchedule> findByParentId(Long parentId) {
        return null;
    }

    @Override
    public List<TravelSchedule> findByTwoParentId(Long parentOneId, Long parentTwoId) {
        return null;
    }

    @Override
    public TravelSchedule findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<TravelSchedule> getAll() {
        return (List<TravelSchedule>) repo.findAll();
    }
}
