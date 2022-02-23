package com.example.travel.service;

import com.example.travel.entity.HotelReservation;
import com.example.travel.entity.Payment;
import com.example.travel.entity.User;
import com.example.travel.repository.HotelReservationRepository;
import com.example.travel.service.iservice.IService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelReservationService implements IService<HotelReservation>{

    private HotelReservationRepository repo;
    @Qualifier("userService")
    private IService<User> userService;
    @Qualifier("paymentService")
    private IService<Payment> paymentService;

    public HotelReservationService(HotelReservationRepository repo, IService<User> userService, IService<Payment> paymentService) {
        this.repo = repo;
        this.userService = userService;
        this.paymentService = paymentService;
    }

    @Override
    public HotelReservation save(Long parentId, HotelReservation object) {
        return null;
    }

    @Override
    public HotelReservation save(Long userId, Long paymentId, HotelReservation object) {
        User user=userService.findById(userId);
        Payment payment=paymentService.findById(paymentId);
        object.setOrderingUser(user);
        object.setPayment(payment);
        return repo.save(object);
    }

    @Override
    public HotelReservation save(Long parentOneId, Long parentTwoId, Long parentThreeId, HotelReservation object) {
        return null;
    }

    @Override
    public HotelReservation save(HotelReservation object) {
        return null;
    }

    @Override
    public List<HotelReservation> findByParentId(Long userId) {
        User user=userService.findById(userId);
        return repo.findAllByOrderingUser(user);
    }

    @Override
    public List<HotelReservation> findByTwoParentId(Long userId, Long paymentId) {
        User user=userService.findById(userId);
        Payment payment=paymentService.findById(paymentId);
        return repo.findAllByOrderingUserAndPayment(user,payment);
    }

    @Override
    public HotelReservation findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<HotelReservation> getAll() {
        return (List<HotelReservation>) repo.findAll();
    }
}
