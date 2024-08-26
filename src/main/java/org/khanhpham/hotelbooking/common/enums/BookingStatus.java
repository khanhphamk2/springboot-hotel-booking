package org.khanhpham.hotelbooking.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BookingStatus {
    PENDING("Pending"),
    CONFIRMED("Confirmed"),
    CHECKED_IN("Checked In"),
    CHECKED_OUT("Checked Out"),
    BOOKED("Booked"),
    CANCELLED("Cancelled");
//    NO_SHOW("No Show");

    private final String displayName;

    public static BookingStatus fromDisplayName(String displayName) {
        for (BookingStatus status : BookingStatus.values()) {
            if (status.getDisplayName().equalsIgnoreCase(displayName)) {
                return status;
            }
        }
        throw new IllegalArgumentException("No enum constant with displayName " + displayName);
    }
}
