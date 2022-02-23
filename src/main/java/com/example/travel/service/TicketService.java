package com.example.travel.service;

import com.example.travel.entity.Passenger;
import com.example.travel.entity.Payment;
import com.example.travel.entity.Ticket;
import com.example.travel.entity.TravelSchedule;
import com.example.travel.repository.TicketRepository;
import com.example.travel.service.iservice.IService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService implements IService<Ticket>{

    private TicketRepository repo;
    @Qualifier("travelScheduleService")
    private IService<TravelSchedule> travelScheduleService;
    @Qualifier("passengerService")
    private IService<Passenger> passengerService;
    @Qualifier("paymentService")
    private IService<Payment> paymentService;

    public TicketService(TicketRepository repo, IService<TravelSchedule> travelScheduleService
            , IService<Passenger> passengerService, IService<Payment> paymentService) {
        this.repo = repo;
        this.travelScheduleService = travelScheduleService;
        this.passengerService = passengerService;
        this.paymentService = paymentService;
    }

    @Override
    public Ticket save(Long parentId, Ticket object) {
        return null;
    }

    @Override
    public Ticket save(Long parentOneId, Long parentTwoId, Ticket object) {
        return null;
    }

    @Override
    public Ticket save(Long travelScheduleId, Long passengerId, Long paymentId, Ticket object) {
        TravelSchedule travelSchedule=travelScheduleService.findById(travelScheduleId);
        Passenger passenger=passengerService.findById(passengerId);
        Payment payment=paymentService.findById(paymentId);
        object.setPassenger(passenger);
        object.setPayment(payment);
        object.setTravelInformation(travelSchedule);

        return repo.save(object);
    }

    @Override
    public Ticket save(Ticket object) {
        return null;
    }

    @Override
    public List<Ticket> findByParentId(Long parentId) {
        return null;
    }

    @Override
    public List<Ticket> findByTwoParentId(Long parentOneId, Long parentTwoId) {
        return null;
    }

//    @Override
//    public List<Ticket> findByThreeParentId(Long parentOneId, Long parentTwoId, Long parentThreeId) {
//        return null;
//    }

    @Override
    public Ticket findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Ticket> getAll() {
        return (List<Ticket>) repo.findAll();
    }
}
