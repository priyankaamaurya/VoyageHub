package com.jsp.VoyageHub.controller;

import com.jsp.VoyageHub.dto.LoginRequest;
import com.jsp.VoyageHub.entity.User;
import com.jsp.VoyageHub.service.UserService;
import jakarta.validation.constraints.Email;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user){

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(userService.register(user));
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody LoginRequest loginRequest){

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(userService.login(loginRequest));
    }


}
