package com.example.travel.repository;

import com.example.travel.common.BaseRepository;
import com.example.travel.entity.Ticket;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TicketRepository extends BaseRepository<Ticket,Long> {
}
