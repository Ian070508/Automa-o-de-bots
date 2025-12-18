package com.githib.vinizx3.bot.dto;

public class UserResponseDTO {
    private long id;
    private String email;

    public UserResponseDTO(long id, String email) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
