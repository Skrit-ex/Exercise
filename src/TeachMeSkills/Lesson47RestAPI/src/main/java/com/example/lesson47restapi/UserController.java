package com.example.lesson47restapi;


import lombok.SneakyThrows;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {


    private final List<User> users = new ArrayList<>();

    private final Map<String, byte[]> avatar = new HashMap<>();

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        users.add(user);
        return ResponseEntity.ok(user);
    }


    @PostMapping("/{username}/save")
    public ResponseEntity<User> save(@RequestBody User user) {
        users.add(user);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    private ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(users);
    }

    @GetMapping("{username}")
    public ResponseEntity<User> findByUsername(@PathVariable String username) {
        if (username.equals("ADMIN")) {
            throw new RuntimeException("Error");
        }
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return ResponseEntity.ok(user);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<Void> deleteByUsername(@PathVariable String username) {
        if (users.removeIf(user -> user.getUsername().equals(username))) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }


    @SneakyThrows  //annotation lombok exception
    @PostMapping("/{username}/upload")
    public ResponseEntity<Void> uploadAvatar(@PathVariable String username,
                                             MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        avatar.put(username, file.getBytes());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{username}/download")
    public ResponseEntity<byte[]> downloadAvatar(@PathVariable String username){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.IMAGE_JPEG_VALUE);
        return new ResponseEntity<>(avatar.get(username), httpHeaders ,HttpStatus.OK);
    }
}
