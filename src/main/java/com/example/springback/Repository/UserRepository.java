package com.example.springback.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springback.Entite.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    }