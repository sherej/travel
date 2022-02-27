package com.example.travel.service;

import com.example.travel.common.BaseMapper;
import com.example.travel.common.BaseRepository;
import com.example.travel.common.BaseServiceImpl;
import com.example.travel.dto.TicketDTO;
import com.example.travel.entity.Ticket;
import com.example.travel.mapper.TicketMapper;
import com.example.travel.repository.TicketRepository;
import com.example.travel.service.iservice.TicketService;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl extends BaseServiceImpl<Ticket, TicketDTO,Long> implements TicketService {

    private final TicketRepository repo;

    private final TicketMapper mapper;

    public TicketServiceImpl(TicketRepository repo,TicketMapper  mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    protected BaseRepository<Ticket, Long> getRepo() {
        return repo;
    }

    @Override
    protected BaseMapper<Ticket, TicketDTO> getMapper() {
        return mapper;
    }
}
