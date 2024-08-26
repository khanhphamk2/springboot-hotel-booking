package org.khanhpham.hotelbooking.service;

import org.khanhpham.hotelbooking.payload.dto.BookedRoomDTO;
import org.springframework.stereotype.Service;

@Service
public interface BookingService {
    BookedRoomDTO bookRoom(BookedRoomDTO bookedRoomDTO);
}
