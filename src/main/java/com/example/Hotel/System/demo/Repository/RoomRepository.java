package com.example.Hotel.System.demo.Repository;

import com.example.Hotel.System.demo.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Integer> {
}
