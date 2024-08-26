package org.khanhpham.hotelbooking.payload.dto;

import lombok.*;

/**
 * DTO for {@link org.khanhpham.hotelbooking.entity.BookedRoom}
 */
@Data
@Getter
@Setter
@AllArgsConstructor
public class BookedRoomDTO {
    private Long id;
    private RoomDTO room;
    private UserDTO user;
    private DiscountDTO discount;
    private String checkInDate;
    private String checkOutDate;
    private double totalPrice;
    private boolean isPaid;
    private boolean isCanceled;
    private String canceledDate;
    private String description;
}
