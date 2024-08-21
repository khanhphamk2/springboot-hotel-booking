package org.khanhpham.hotelbooking.dto;

import lombok.Data;

@Data
public class DiscountDto {
    private Long id;
    private String discountCode;
    private double discountValue;
    private boolean isActive;
    private boolean isExpired;
    private String expiredDate;
    private String description;
}
