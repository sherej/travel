package com.example.travel.repository;

import com.example.travel.entity.Hotel;
import com.example.travel.entity.Room;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends PagingAndSortingRepository<Room,Long>{
    List<Room> findAllByHotel(Hotel hotel);
}
