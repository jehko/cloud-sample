package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1")
@RestController
public class UserController {

    @GetMapping("/user")
    public ResponseEntity<?> getUserId() {
        String userId = "82223053";
        return ResponseEntity.ok(userId);
}
