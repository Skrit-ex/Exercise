package com.example.lesson47restapi;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    private final List<User> users = new ArrayList<>();


    @PostMapping("/save")
    public ResponseEntity<User> save(@RequestBody User user){
        users.add(user);
        return  ResponseEntity.ok(user);
    }

    @GetMapping
    private ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok(users);
    }

    @GetMapping("{username}")
    public ResponseEntity<User> findByUsername(@PathVariable String username){
        if(username.equals("ADMIN")){
            throw new RuntimeException("Error");
        }
        for(User user:users){
            if(user.getUsername().equals(username)){
                return ResponseEntity.ok(user);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<Void> deleteByUsername(@PathVariable String username){
        if(users.removeIf(user -> user.getUsername().equals(username))){
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }


    @PostMapping("/upload")
    public void uploadAvatar (@PathVariable String username,
                                  MultipartFile file){
        System.out.println(file);
    }
}
