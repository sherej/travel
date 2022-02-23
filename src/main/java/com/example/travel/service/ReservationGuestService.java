package com.example.travel.service;

import com.example.travel.entity.HotelReservation;
import com.example.travel.entity.Passenger;
import com.example.travel.entity.ReservationGuest;
import com.example.travel.repository.ReservationGuestRepository;
import com.example.travel.service.iservice.IService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationGuestService implements IService<ReservationGuest>{

    private ReservationGuestRepository repo;
    @Qualifier("hotelReservationService")
    private IService<HotelReservation> hotelReservationService;
    @Qualifier("guestService")
    private IService<Passenger> guestService;

    public ReservationGuestService(ReservationGuestRepository repo
            , IService<HotelReservation> hotelReservationService, IService<Passenger> guestService) {
        this.repo = repo;
        this.hotelReservationService = hotelReservationService;
        this.guestService = guestService;
    }

    @Override
    public ReservationGuest save(Long parentId, ReservationGuest object) {
        return null;
    }

    @Override
    public ReservationGuest save(Long hotelReservationId, Long guestId, ReservationGuest object) {
        HotelReservation hotelReservation=hotelReservationService.findById(hotelReservationId);
        Passenger guest=guestService.findById(guestId);
        object=new ReservationGuest();
        object.setHotelReservation(hotelReservation);
        object.setGuest(guest);
        return repo.save(object);
    }

    @Override
    public ReservationGuest save(Long parentOneId, Long parentTwoId, Long parentThreeId, ReservationGuest object) {
        return null;
    }

    @Override
    public ReservationGuest save(ReservationGuest object) {
        return null;
    }

    @Override
    public List<ReservationGuest> findByParentId(Long parentId) {
        return null;
    }

    @Override
    public List<ReservationGuest> findByTwoParentId(Long hotelReservationId, Long guestId) {
        HotelReservation hotelReservation=hotelReservationService.findById(hotelReservationId);
        Passenger guest=guestService.findById(guestId);

        return repo.findAllByHotelReservationAndGuest(hotelReservation,guest);
    }

    @Override
    public ReservationGuest findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<ReservationGuest> getAll() {
        return (List<ReservationGuest>) repo.findAll();
    }
}
