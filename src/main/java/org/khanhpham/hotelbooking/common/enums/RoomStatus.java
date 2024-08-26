package org.khanhpham.hotelbooking.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RoomStatus {
    AVAILABLE("Available"),
    OCCUPIED("Occupied"),
    RESERVED("Reserved"),
    UNDER_MAINTENANCE("Under Maintenance"),
    OUT_OF_ORDER("Out of Order"),
    CLEANING("Cleaning");

    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    // Tìm kiếm RoomStatus từ displayName
    public static RoomStatus fromDisplayName(String displayName) {
        for (RoomStatus status : RoomStatus.values()) {
            if (status.getDisplayName().equalsIgnoreCase(displayName)) {
                return status;
            }
        }
        throw new IllegalArgumentException("No enum constant with displayName " + displayName);
    }
}