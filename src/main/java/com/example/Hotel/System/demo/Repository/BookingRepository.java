package com.example.Hotel.System.demo.Repository;

import com.example.Hotel.System.demo.Entity.BookedRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<BookedRoom,Integer> {
}
