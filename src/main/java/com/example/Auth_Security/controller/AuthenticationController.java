package com.example.Auth_Security.controller;


import com.example.Auth_Security.dto.SignUpRequest;
import com.example.Auth_Security.dto.jwtAuthenticationResponse;
import com.example.Auth_Security.dto.refreshTokenRequest;
import com.example.Auth_Security.dto.signInRequest;
import com.example.Auth_Security.entities.User;
import com.example.Auth_Security.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthenticationController {


    private final AuthenticationService authenticationService;

    @PostMapping("/signUp")
    public ResponseEntity<User> signUp(@RequestBody SignUpRequest signUpRequest){
        return ResponseEntity.ok(authenticationService.signUp(signUpRequest));
    }

    @PostMapping("/signIn")
    public ResponseEntity<jwtAuthenticationResponse> signIn (@RequestBody signInRequest signInRequest){
        return ResponseEntity.ok(authenticationService.signIn(signInRequest));
    }


    @PostMapping("/refresh")
    public ResponseEntity<jwtAuthenticationResponse> refresh (@RequestBody refreshTokenRequest refreshTokenRequest){
        return ResponseEntity.ok(authenticationService.refreshToken(refreshTokenRequest));
    }

}
