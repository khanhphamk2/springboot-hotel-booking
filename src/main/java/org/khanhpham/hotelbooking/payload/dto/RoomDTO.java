package org.khanhpham.hotelbooking.payload.dto;

import lombok.*;

/**
 * DTO for {@link org.khanhpham.hotelbooking.entity.Room}
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoomDTO extends AuditDTO{
    private Long id;
    private String name;
    private String roomNumber;
    private String roomType;
    private String bedType;
    private Double roomPrice;
    private boolean isBooked;
}
