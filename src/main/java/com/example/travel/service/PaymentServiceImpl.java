package com.example.travel.service;

import com.example.travel.common.BaseMapper;
import com.example.travel.common.BaseRepository;
import com.example.travel.common.BaseServiceImpl;
import com.example.travel.dto.PaymentDTO;
import com.example.travel.entity.Payment;
import com.example.travel.mapper.PaymentMapper;
import com.example.travel.repository.PaymentRepository;
import com.example.travel.service.iservice.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl extends BaseServiceImpl<Payment, PaymentDTO,Long> implements PaymentService {

    private final PaymentRepository repo;

    private final PaymentMapper mapper;

    public PaymentServiceImpl(PaymentRepository repo, PaymentMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    protected BaseRepository<Payment, Long> getRepo() {
        return repo;
    }

    @Override
    protected BaseMapper<Payment, PaymentDTO> getMapper() {
        return mapper;
    }
}
