package com.jsp.VoyageHub.service.impl;

import com.jsp.VoyageHub.dto.LoginRequest;
import com.jsp.VoyageHub.entity.User;
import com.jsp.VoyageHub.repository.UserRepository;
import com.jsp.VoyageHub.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User register(User user) {
        return userRepository.save(user);
    }

    @Override
    public User login(LoginRequest loginRequest) {
        return null;
    }
}
