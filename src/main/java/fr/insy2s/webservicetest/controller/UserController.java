package fr.insy2s.webservicetest.controller;

import fr.insy2s.webservicetest.dto.UserDTO;
import fr.insy2s.webservicetest.entity.User;
import fr.insy2s.webservicetest.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    private final ModelMapper modelMapper;

    public UserController(UserService userService, ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/")
    public List<UserDTO> getAllUsers() {
        return userService.findAll().stream().map(user -> modelMapper.map(user, UserDTO.class)).collect(Collectors.toList());
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
