package com.example.service;

import com.example.dto.LoginDto;
import com.example.dto.RegUserDto;
import com.example.entity.User;
import com.example.entity.UserRole;
import com.example.mapper.RegUserMapper;
import com.example.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;


@Slf4j
@Transactional
@Service
public class UserService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;


    public boolean save(RegUserDto regUserDto) {

        if (userRepository.existsUserByEmailAndUsername(regUserDto.getEmail(), regUserDto.getUsername())) {
            log.info( "user already exist");
            return false;
        }

        User user = RegUserMapper.regUserDtoToUser(regUserDto);
        user.setRole(Set.of(UserRole.USER));
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        log.info("user just saved");
        return true;
    }

    public Optional<User> findByEmail(String email) {
        Optional<User> getEmail = userRepository.findByEmail(email);
        if (getEmail.isPresent()) {
            log.info("Email found ->" + getEmail);
            return getEmail;
        } else {
            log.error("email not found");
            return Optional.empty();
        }
    }
    public Optional<User> findByPassword (String password){
        Optional<User> getPassword = userRepository.findByPassword(password);
        if(getPassword.isPresent()){
            log.info("password found ");
            return getPassword;
        }else {
            log.error(" has error or password not found ");
        }
        return Optional.empty();
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> byEmail = userRepository.findByEmail(email);
            if(byEmail.isPresent()){
                return byEmail.get();
            }
            throw  new UsernameNotFoundException("User not found");
        }
    }

