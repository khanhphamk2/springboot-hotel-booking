package org.khanhpham.hotelbooking.service;

import org.khanhpham.hotelbooking.payload.dto.BookedRoomDTO;
import org.khanhpham.hotelbooking.repository.BookedRoomRepository;
import org.khanhpham.hotelbooking.repository.RoomRepository;
import org.khanhpham.hotelbooking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {
    private final BookedRoomRepository bookedRoomRepository;
    private final UserRepository userRepository;
    private final RoomRepository roomRepository;

    @Autowired
    public BookingServiceImpl(BookedRoomRepository bookedRoomRepository, UserRepository userRepository, RoomRepository roomRepository) {
        this.bookedRoomRepository = bookedRoomRepository;
        this.userRepository = userRepository;
        this.roomRepository = roomRepository;
    }

    @Override
    public BookedRoomDTO bookRoom(BookedRoomDTO bookedRoomDTO) {
//        BookedRoom savedBooking = null;
//        User user = userRepository.findById(bookedRoomDTO.getUserId(savedBooking.getUser().getId()))
//               .orElseThrow(() -> new ResourceNotFoundException("User not found with id " + bookedRoomDTO.getUserId(savedBooking.getUser().getId())));
//
//        Room room = roomRepository.findById(bookedRoomDTO.getRoomId())
//                .orElseThrow(() -> new ResourceNotFoundException("Room not found with id " + bookedRoomDTO.getRoomId()));
//
//        BookedRoom bookedRoom = new BookedRoom();
//        bookedRoom.setUser(user);
//        bookedRoom.setRoom(room);
//        bookedRoom.setStartDate(bookedRoomDTO.getStartDate());
//        bookedRoom.setEndDate(bookedRoomDTO.getEndDate());
//        bookedRoom.setStatus("Booked");
//
//        savedBooking = bookedRoomRepository.save(bookedRoom);
//
//        // Convert saved booking back to DTO
//        BookedRoomDTO resultDTO = new BookedRoomDTO();
//        resultDTO.getUserId(savedBooking.getUser().threadId());
//        resultDTO.setRoomId(savedBooking.getRoom().getId());
//        resultDTO.setStartDate(savedBooking.getStartDate());
//        resultDTO.setEndDate(savedBooking.getEndDate());
//        resultDTO.setStatus(savedBooking.getStatus());
//
//        return resultDTO;

        return null;
    }

    @Override
    public void booking() {
        System.out.println("Booking successfully!");
    }

    @Override
    public void cancelBooking() {
        System.out.println("Cancel booking successfully!");
    }

    @Override
    public void updateBooking() {
        System.out.println("Update booking successfully!");
    }

    @Override
    public void getBooking() {
        System.out.println("Get booking successfully!");
    }

    @Override
    public void getAllBooking() {
        System.out.println("Get all booking successfully!");
    }
}
