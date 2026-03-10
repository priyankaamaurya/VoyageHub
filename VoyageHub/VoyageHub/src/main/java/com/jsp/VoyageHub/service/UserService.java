package com.jsp.VoyageHub.service;

import com.jsp.VoyageHub.dto.LoginRequest;
import com.jsp.VoyageHub.entity.User;

public interface UserService {

    User register(User user);
    User login( LoginRequest loginRequest );
}
