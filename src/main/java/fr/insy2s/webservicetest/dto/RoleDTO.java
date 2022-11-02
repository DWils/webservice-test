package fr.insy2s.webservicetest.dto;

import fr.insy2s.webservicetest.entity.User;
import java.util.Set;

public class RoleDTO {
    private String roleName;
    private Set<User> users;
}
