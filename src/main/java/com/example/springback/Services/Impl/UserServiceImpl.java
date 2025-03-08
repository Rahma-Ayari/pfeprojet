package com.example.springback.Services.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.springback.Entite.Role;
import com.example.springback.Entite.User;
import com.example.springback.Repository.UserRepository;
import com.example.springback.Services.UserService;

import java.util.Collection;
import java.util.Optional;

@Service // Ensure this annotation is present
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder; // This will be injected by Spring



    @Override
    public User createUser(String username, String password, Collection<Role> roles) {
        if (userRepository.findByUsername(username).isPresent()) {
            throw new RuntimeException("User already exists with username: " + username);
        }

        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        user.setRoles(roles);

        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void updatePassword(String username, String newPassword) {
        User user = userRepository.findByUsername(username)
            .orElseThrow(() -> new RuntimeException("User not found with username: " + username));

        user.setPassword(passwordEncoder.encode(newPassword));
        userRepository.save(user);
    }
}