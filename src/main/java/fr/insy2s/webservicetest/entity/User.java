package fr.insy2s.webservicetest.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="user2")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private LocalDate dayOfBirth;

    @ManyToMany
    @JoinTable(
            name = "assignedRoles",
            joinColumns = @JoinColumn(name="role_id"),
            inverseJoinColumns = @JoinColumn(name="user_id")
    )
    private Set<Role> assignedRoles;

}
