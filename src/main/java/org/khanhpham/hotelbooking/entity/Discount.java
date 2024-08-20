package org.khanhpham.hotelbooking.entity;

import jakarta.persistence.*;
import lombok.*;
import org.khanhpham.hotelbooking.config.enums.DiscountType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "discounts")
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private DiscountType type;
    private String code;
    private int value;
    private String description;
    private boolean status;
}
