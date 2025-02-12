package com.example.mapper;

import com.example.dto.RegUserDto;
import com.example.entity.User;

public class RegUserMapper {

    public static User regUserDtoToUser(RegUserDto regUserDto){
        User user = new User();
        user.setUsername(regUserDto.getUsername());
        user.setEmail(regUserDto.getEmail());
        user.setPassword(regUserDto.getPassword());
        return user;
    }
}
