package org.khanhpham.hotelbooking.payload.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ReviewDTO extends AuditDTO {
    private Long id;
    private String content;
    private int rating;
    private Long roomId;
    private UserDTO user;
}
