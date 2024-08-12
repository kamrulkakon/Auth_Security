package com.example.Auth_Security.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class jwtAuthenticationResponse {

    private String token;

    private String refreshToken;
}
