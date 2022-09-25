package fr.insy2s.webservicetest.service;

import fr.insy2s.webservicetest.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User createUser(User user);

    User findById(Long id);
}
