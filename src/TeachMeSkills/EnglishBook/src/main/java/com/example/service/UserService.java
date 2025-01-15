package com.example.service;

import com.example.dto.LoginDto;
import com.example.dto.RegUserDto;
import com.example.entity.SessionUser;
import com.example.entity.User;
import com.example.mapper.RegUserMapper;
import com.example.mapper.UserSessionMapper;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;
    public void save(RegUserDto regUserDto){
        User user = RegUserMapper.regUserDtoToUser(regUserDto);
        userRepository.save(user);
    }

    public Optional<SessionUser> login (LoginDto loginDto){
        Optional<User> user = userRepository.findByEmail(loginDto.getEmail());

        if(user.isPresent()){

            User currentUser =user.get();

            if(currentUser.getPassword().equals(loginDto.getPassword())){
                return Optional.of(UserSessionMapper.userToSessionUser(currentUser));
            }
        }
        return Optional.empty();

    }
}
