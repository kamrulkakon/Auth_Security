package com.example.Auth_Security.repository;

import com.example.Auth_Security.entities.Role;
import com.example.Auth_Security.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {


    Optional<User> findByEmail(String email);

    User findByRole(Role role);
}
