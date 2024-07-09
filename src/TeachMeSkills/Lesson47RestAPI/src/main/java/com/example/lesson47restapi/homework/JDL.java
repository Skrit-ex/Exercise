package com.example.lesson47restapi.homework;


import ai.djl.repository.zoo.ZooModel;
import com.example.lesson47restapi.User;
import lombok.SneakyThrows;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/jdl")
public class JDL {

    private final List<User> users = new ArrayList<>();

    private final Map<String, byte[]> image = new HashMap<>();

    @PostMapping()
    public ResponseEntity<User> save(@RequestBody User user) {
        users.add(user);
        return ResponseEntity.ok(user);
    }
    @GetMapping
    private ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(users);
    }


    @SneakyThrows
    @PostMapping("/{username}/save")
    public ResponseEntity<Void> saveImage(@PathVariable String username,
                                          MultipartFile file){

        if(file.isEmpty()){
            return ResponseEntity.badRequest().build();
        }
        image.put(username, file.getBytes());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{username}/download")
    public ResponseEntity<byte[]> downloadImage(@PathVariable String username){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.IMAGE_JPEG_VALUE);
        byte[] imageBytes = image.get(username);

        //save image to file
        try {
            File tempFile = File.createTempFile("downloadImage", ".jpg");
            System.out.println("your path" + tempFile.getAbsolutePath());
            Files.write(tempFile.toPath(), imageBytes);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(image.get(username), httpHeaders, HttpStatus.OK);
    }





}
