package com.example.Auth_Security.services;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {


    UserDetailsService userDetailsService();
}
