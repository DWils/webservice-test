package fr.insy2s.webservicetest.repository;

import fr.insy2s.webservicetest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
