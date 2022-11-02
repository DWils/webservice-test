package fr.insy2s.webservicetest.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class UserDTO {
    private Long id;
    private String firstname;
    private String lastname;
    private LocalDate dayOfBirth;
    private Set<RoleDTO> roles;
}
