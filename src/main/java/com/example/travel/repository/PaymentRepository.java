package com.example.travel.repository;

import com.example.travel.entity.Payment;
import com.example.travel.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends PagingAndSortingRepository<Payment,Long>{
    List<Payment> findAllByPayedUser(User user);
}
