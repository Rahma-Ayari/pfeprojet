package com.example.springback.Services;
import java.util.Collection;
import java.util.Optional;

import com.example.springback.Entite.Role;
import com.example.springback.Entite.User;

public interface UserService {
    User createUser(String username, String password, Collection<Role> roles);
    Optional<User> findByUsername(String username);
    void updatePassword(String username, String newPassword);



}