package com.example.controller;

import com.example.converter.UserConverter;
import com.example.dto.UserDto;
import com.example.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void createUser(@RequestBody UserDto userDto) {
        userService.save(UserConverter.fromDto(userDto));
    }

    @GetMapping("/{id}")
    public UserDto readUser(@PathVariable Long id) {
        return UserConverter.toDto(userService.findById(id));
    }
}
