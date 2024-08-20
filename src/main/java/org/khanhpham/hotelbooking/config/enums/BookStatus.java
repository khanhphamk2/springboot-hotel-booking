package org.khanhpham.hotelbooking.config.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum BookStatus {
    PENDING("Pending"),
    PAID("Paid"),
    CANCELLED("Cancelled");

    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }
}
