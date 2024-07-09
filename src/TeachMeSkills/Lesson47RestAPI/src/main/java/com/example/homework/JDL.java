package com.example.homework;


import lombok.SneakyThrows;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/jdl")
public class JDL {

    private final Map<String, byte[]> image = new HashMap<>();

    @SneakyThrows
    @PostMapping("/{username}/save")
    public ResponseEntity<Void> saveImage(@PathVariable String username,
                                          MultipartFile file){

        if(file.isEmpty()){
            throw new RuntimeException("File not found");
        }
        image.put(username,file.getBytes());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{username}/download")
    public ResponseEntity<byte[]> downloadImage(@PathVariable String username){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.IMAGE_JPEG_VALUE);
        return new ResponseEntity<>(image.get(username), httpHeaders, HttpStatus.OK);
    }
}
