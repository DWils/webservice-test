package fr.insy2s.webservicetest.repository;

import fr.insy2s.webservicetest.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}
