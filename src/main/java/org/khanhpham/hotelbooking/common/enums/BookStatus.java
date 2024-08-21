package org.khanhpham.hotelbooking.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BookStatus {
    PENDING("Pending"),
    BOOKED("Booked"),
    CANCELLED("Cancelled");

    private final String displayName;
}
