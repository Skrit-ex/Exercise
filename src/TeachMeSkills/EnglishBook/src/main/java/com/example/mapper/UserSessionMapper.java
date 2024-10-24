package com.example.mapper;

import com.example.entity.SessionUser;
import com.example.entity.User;

public class UserSessionMapper {

    public static SessionUser userToSessionUser(User user) {
        SessionUser sessionUser = new SessionUser();
        sessionUser.setId(user.getId());
        sessionUser.setEmail(user.getEmail());
        sessionUser.setUsername(user.getUserName());
        sessionUser.setName(user.getName());
        return sessionUser;
    }
}
