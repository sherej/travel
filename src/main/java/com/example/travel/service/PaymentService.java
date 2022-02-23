package com.example.travel.service;

import com.example.travel.entity.Payment;
import com.example.travel.entity.User;
import com.example.travel.repository.PaymentRepository;
import com.example.travel.service.iservice.IService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService implements IService<Payment>{

    private PaymentRepository repo;
    @Qualifier("userService")
    private IService<User> userService;

    public PaymentService(PaymentRepository repo, IService<User> userService) {
        this.repo = repo;
        this.userService = userService;
    }

    @Override
    public Payment save(Long parentId, Payment object) {
        User user=userService.findById(parentId);
        object.setPayedUser(user);
        return repo.save(object);
    }

    @Override
    public Payment save(Long parentOneId, Long parentTwoId, Payment object) {
        return null;
    }

    @Override
    public Payment save(Long parentOneId, Long parentTwoId, Long parentThreeId, Payment object) {
        return null;
    }

    @Override
    public Payment save(Payment object) {
        return null;
    }

    @Override
    public List<Payment> findByParentId(Long parentId) {
        User user= userService.findById(parentId);

        return repo.findAllByPayedUser(user);
    }

    @Override
    public List<Payment> findByTwoParentId(Long parentOneId, Long parentTwoId) {
        return null;
    }

    @Override
    public Payment findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Payment> getAll() {
        return (List<Payment>) repo.findAll();
    }
}
