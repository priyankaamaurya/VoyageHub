package com.jsp.VoyageHub.service;

import com.jsp.VoyageHub.dto.LoginRequest;
import com.jsp.VoyageHub.entity.User;
import jakarta.validation.constraints.Email;
import org.jspecify.annotations.Nullable;

public interface UserService {

    User register(User user);
    User login( LoginRequest loginRequest );

//    User findByEmailAndPassword(Email email, String password);
}
