package com.example.converter;

import com.example.dto.UserDto;
import com.example.model.User;

public class UserConverter {

    private UserConverter() {
    }

    public static UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());

        return userDto;
    }

    public static User fromDto(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());

        return user;
    }
}
