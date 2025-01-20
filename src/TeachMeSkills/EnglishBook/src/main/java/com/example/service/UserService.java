package com.example.service;

import com.example.dto.LoginDto;
import com.example.dto.RegUserDto;
import com.example.entity.User;
import com.example.mapper.RegUserMapper;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.logging.Level;
import java.util.logging.Logger;

@Transactional
@Service
public class UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    private final Logger log = Logger.getLogger(UserService.class.getName());
    @Autowired
    private UserRepository userRepository;

    public boolean save(RegUserDto regUserDto) {

        if (userRepository.existsUserByEmailAndUserName(regUserDto.getEmail(), regUserDto.getUsername())) {
            log.log(Level.INFO, "user already exist");
            return false;
        }

        User user = RegUserMapper.regUserDtoToUser(regUserDto);
        userRepository.save(user);
        log.log(Level.INFO, "user just saved");
        return true;
    }
}
