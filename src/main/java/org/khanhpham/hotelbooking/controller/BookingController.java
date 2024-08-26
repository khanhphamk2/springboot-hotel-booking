package org.khanhpham.hotelbooking.controller;

import org.khanhpham.hotelbooking.payload.dto.BookedRoomDTO;
import org.khanhpham.hotelbooking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bookings")
public class BookingController {
    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/book")
    public ResponseEntity<BookedRoomDTO> bookRoom(@RequestBody BookedRoomDTO bookedRoomDTO) {
        BookedRoomDTO resultDTO = bookingService.bookRoom(bookedRoomDTO);
        return ResponseEntity.ok(resultDTO);
    }

    @PostMapping("/")
    public String booking() {
        return "Booking successfully!";
    }
}
