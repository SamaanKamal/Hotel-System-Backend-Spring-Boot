package com.example.Hotel.System.demo.DTO.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponseDTO {
    private Integer bookingId;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private String guestFullName;

    private String guestEmail;

    private int NumOfAdults;

    private int NumOfChildren;

    private int totalNumOfGuest;

    private String bookingConfirmationCode;

    private RoomResponseDTO roomResponseDTO;

    public BookingResponseDTO(Integer bookingId, LocalDate checkInDate, LocalDate checkOutDate, String bookingConfirmationCode) {
        this.bookingId = bookingId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.bookingConfirmationCode = bookingConfirmationCode;
    }
}
