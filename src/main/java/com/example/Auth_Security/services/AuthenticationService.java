package com.example.Auth_Security.services;

import com.example.Auth_Security.dto.SignUpRequest;
import com.example.Auth_Security.dto.jwtAuthenticationResponse;
import com.example.Auth_Security.dto.refreshTokenRequest;
import com.example.Auth_Security.dto.signInRequest;
import com.example.Auth_Security.entities.User;

public interface AuthenticationService {


    User signUp (SignUpRequest signUpRequest);

    jwtAuthenticationResponse signIn (signInRequest signInRequest);

    jwtAuthenticationResponse refreshToken(refreshTokenRequest refreshTokenRequest);
}
