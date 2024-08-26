package org.khanhpham.hotelbooking.repository;

import org.khanhpham.hotelbooking.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    Room findByRoomId(Long roomId);
    Room findByRoomType(String roomType);
    Room findByRoomPrice(double roomPrice);
    Room findByRoomStatus(boolean roomStatus);
}
