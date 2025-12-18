package com.githib.vinizx3.bot.service;

import com.githib.vinizx3.bot.domain.user.User;
import com.githib.vinizx3.bot.repository.UserReposity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserReposity userReposity;

    public UserService(UserReposity userReposity) {
        this.userReposity = userReposity;
    }


    public User createUser(String email, String password){
        if (userReposity.existsByEmail(email)){
            throw new RuntimeException("Email já cadastrado");
        }

        User user = new User();
        user.setEmail(email);
        user.setPassword(password);

        return userReposity.save(user);
    }



}
