package fr.insy2s.webservicetest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String roleName;

    @ManyToMany(mappedBy = "assignedRoles")
    private Set<User> users;
}
