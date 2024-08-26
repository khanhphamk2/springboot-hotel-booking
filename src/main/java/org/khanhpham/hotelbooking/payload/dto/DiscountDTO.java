package org.khanhpham.hotelbooking.payload.dto;

import lombok.*;

/**
 * DTO for {@link org.khanhpham.hotelbooking.entity.Discount}
 */
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DiscountDTO {
    private Long id;
    private String discountCode;
    private double discountValue;
    private boolean isActive;
    private boolean isExpired;
    private String expiredDate;
    private String description;
}
