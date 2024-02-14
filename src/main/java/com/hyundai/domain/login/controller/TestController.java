package com.hyundai.domain.login.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class TestController {

    @RequestMapping("/test")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok().body("WillEat api ok");
    }
}