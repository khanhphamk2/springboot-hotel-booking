package org.khanhpham.hotelbooking.payload.dto;

import lombok.Data;

import java.util.Set;

/**
 * DTO for {@link org.khanhpham.hotelbooking.entity.Profile}
 */
@Data
public class ProfileDTO {
    private Long id;
    private String avatar;
    private String firstName;
    private String lastName;
//    private Set<AddressDTO> addresses;

}
