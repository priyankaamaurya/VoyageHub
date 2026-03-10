package com.jsp.VoyageHub.controller;

import com.jsp.VoyageHub.entity.User;
import com.jsp.VoyageHub.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> register(@RequestBody User user){

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(userService.register(user));
    }
}
