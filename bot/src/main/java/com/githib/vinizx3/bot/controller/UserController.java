package com.githib.vinizx3.bot.controller;


import com.githib.vinizx3.bot.domain.user.User;
import com.githib.vinizx3.bot.dto.UserResponseDTO;
import com.githib.vinizx3.bot.dto.UserResquestDTO;
import com.githib.vinizx3.bot.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserResponseDTO> create (@RequestBody UserResquestDTO dto) {
        User user = userService.createUser(dto.getEmail(), dto.getPassword());

        UserResponseDTO response = new UserResponseDTO(user.getId(), user.getEmail());

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
