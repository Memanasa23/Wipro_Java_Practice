package com.example.userManagement.controller;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.userManagement.Service.UserService;
import com.example.userManagement.dto.LoginRequest;
import com.example.userManagement.dto.LoginResponse;
import com.example.userManagement.dto.UserRegistrationRequest;
import com.example.userManagement.entity.User;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@Valid @RequestBody UserRegistrationRequest request) {
        User user = userService.registerUser(request);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> loginUser(@Valid @RequestBody LoginRequest loginRequest) {
        LoginResponse response = userService.loginUser(loginRequest);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/profile")
    public ResponseEntity<User> getUserProfile(@RequestHeader("X-User-Id") Long userId) {
        User user = userService.getUserById(userId);
        return ResponseEntity.ok(user);
    }

    @PutMapping("/profile")
    public ResponseEntity<User> updateUserProfile(
            @RequestHeader("X-User-Id") Long userId,
            @Valid @RequestBody UserRegistrationRequest request) {
        User user = userService.updateUser(userId, request);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/profile")
    public ResponseEntity<Void> deactivateUser(@RequestHeader("X-User-Id") Long userId) {
        userService.deactivateUser(userId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("User Management Service is running");
    }
}