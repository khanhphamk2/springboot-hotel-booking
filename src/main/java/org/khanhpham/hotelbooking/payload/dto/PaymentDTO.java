package org.khanhpham.hotelbooking.payload.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.khanhpham.hotelbooking.common.enums.PaymentStatus;
import org.khanhpham.hotelbooking.common.enums.PaymentType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * DTO for {@link org.khanhpham.hotelbooking.entity.Payment}
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PaymentDTO extends AuditDTO {
    private Long id;
    private BigDecimal amount;
    private PaymentType paymentType;
    private PaymentStatus paymentStatus;
    private LocalDateTime paymentDate;
    private Long orderId;

}