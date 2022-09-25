package fr.insy2s.webservicetest.controller;

import fr.insy2s.webservicetest.entity.User;
import fr.insy2s.webservicetest.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping(path = "{id}")
    public User getUserById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @PostMapping("/")
    public User createUser(@RequestBody User user){

        User userResponse = userService.createUser(user);

        return userResponse;
    }
}
