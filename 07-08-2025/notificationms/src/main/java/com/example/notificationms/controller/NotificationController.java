package com.example.notificationms.controller;

import org.springframework.web.bind.annotation.*;

import com.example.notificationms.dto.UserActionDTO;

@RestController
public class NotificationController {

	@PostMapping("/notify")
    public void notify(@RequestBody UserActionDTO dto) {
        System.out.println("User " + dto.getUser().getUsername() + " is " + dto.getAction());
    }
}
