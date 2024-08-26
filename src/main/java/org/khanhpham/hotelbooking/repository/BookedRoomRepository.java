package org.khanhpham.hotelbooking.repository;

import org.khanhpham.hotelbooking.entity.BookedRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookedRoomRepository extends JpaRepository<BookedRoom, Long> {
    BookedRoom findByRoomId(Long roomId);
    BookedRoom findByCheckInDate(String checkInDate);
    BookedRoom findByCheckOutDate(String checkOutDate);
    BookedRoom findByIsPaid(boolean isPaid);
}
