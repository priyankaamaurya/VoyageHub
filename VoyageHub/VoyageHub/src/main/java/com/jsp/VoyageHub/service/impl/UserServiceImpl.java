package com.jsp.VoyageHub.service.impl;

import com.jsp.VoyageHub.dto.LoginRequest;
import com.jsp.VoyageHub.entity.User;
import com.jsp.VoyageHub.repository.UserRepository;
import com.jsp.VoyageHub.service.UserService;
import jakarta.validation.constraints.Email;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    public User register(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public User login(LoginRequest loginRequest) {
        return userRepository
                .findByEmailAndPassword(loginRequest.getEmail(), loginRequest.getPassword())
                .orElseThrow(() -> new RuntimeException("Invalid Email or Password"));
    }

}
