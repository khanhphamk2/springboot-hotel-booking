package org.khanhpham.hotelbooking.payload.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.khanhpham.hotelbooking.entity.Role;

import java.util.Set;

/**
 * DTO for {@link org.khanhpham.hotelbooking.entity.User}
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO extends AuditDTO {
    private long id;
    private String username;
    private String email;
    private String phone;
    private Set<Role> roles;
}
