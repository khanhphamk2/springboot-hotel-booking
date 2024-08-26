package org.khanhpham.hotelbooking.payload.dto;

import lombok.Data;

/**
 * DTO for {@link org.khanhpham.hotelbooking.entity.AuditEntity}
 */
@Data
public abstract class AuditDTO {
    private String createdBy;
    private String updatedBy;
    private String createdDate;
    private String updatedDate;
}
