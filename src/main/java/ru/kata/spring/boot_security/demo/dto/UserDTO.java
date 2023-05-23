package ru.kata.spring.boot_security.demo.dto;

import ru.kata.spring.boot_security.demo.models.Role;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

public class UserDTO {
    @NotBlank(message = "Имя пользователя не может быть пустым")
    @Size(min = 5, max = 30, message = "Имя пользователя должно быть от 5 до 30 символов")
    private String username;
    @NotBlank(message = "Пароль не может быть пустым")
    private String password;
    @NotBlank(message = "Электронная почта не может быть пустой")
    @Email
    private String email;

    private Set<Role> roleList = new HashSet<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(Set<Role> roleList) {
        this.roleList = roleList;
    }
}
