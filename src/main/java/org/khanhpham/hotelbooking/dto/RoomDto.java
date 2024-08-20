package org.khanhpham.hotelbooking.dto;

import lombok.Data;

@Data
public class RoomDto {
    private Long id;
    private String name;
    private String roomNumber;
    private String roomType;
    private String bedType;
    private Double roomPrice;
    private boolean isBooked;
}
