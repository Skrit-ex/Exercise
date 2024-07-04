package com.example.lesson47restapi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionController {


    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,  String> re(RuntimeException e){
        Map<String, String> map = new HashMap<>();
        map.put("code", HttpStatus.BAD_REQUEST.toString());
        map.put("message", e.getMessage());
        map.put("timestamp", LocalDateTime.now().toString());
        return map;
    }
}
