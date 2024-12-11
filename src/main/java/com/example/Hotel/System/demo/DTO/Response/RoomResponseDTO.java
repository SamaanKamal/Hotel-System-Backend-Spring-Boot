package com.example.Hotel.System.demo.DTO.Response;

import com.example.Hotel.System.demo.Entity.BookedRoom;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Base64;
import java.util.List;

@Data
@NoArgsConstructor
public class RoomResponseDTO {

    private Integer id;

    private String roomType;

    private BigDecimal roomPrice;

    private Boolean isBooked;

    private String photo;

    private List<BooingResponseDTO> bookings;

    public RoomResponseDTO(Integer id, String roomType, BigDecimal roomPrice) {
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
    }

    public RoomResponseDTO(Integer id, String roomType, BigDecimal roomPrice, Boolean isBooked, byte[] photoByte, List<BooingResponseDTO> bookings) {
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.isBooked = isBooked;
        this.photo = photoByte != null ? Base64.getEncoder().encodeToString(photoByte) : null;
        this.bookings = bookings;
    }
}
