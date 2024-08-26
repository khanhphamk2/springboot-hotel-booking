package org.khanhpham.hotelbooking.payload.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.khanhpham.hotelbooking.common.enums.OrderStatus;
import org.khanhpham.hotelbooking.entity.BookedRoom;
import org.khanhpham.hotelbooking.entity.Discount;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * DTO for {@link org.khanhpham.hotelbooking.entity.Order}
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OrderDTO extends AuditDTO {
    UserDTO user;
    List<BookedRoom> rooms;
    private BigDecimal totalAmount;
    private OrderStatus orderStatus;
    private LocalDateTime orderDate;
    private Discount discount;
    private String description;
}