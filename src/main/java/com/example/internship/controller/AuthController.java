package com.example.internship.controller;

import com.example.internship.dto.authenticationAuthorisation.JwtAuthenticationResponse;
import com.example.internship.dto.authenticationAuthorisation.SignInRequest;
import com.example.internship.dto.authenticationAuthorisation.SignUpRequest;
import com.example.internship.service.AuthenticationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationService authenticationService;

    @PostMapping("/sign-up")
    public JwtAuthenticationResponse signUp(@RequestBody @Valid SignUpRequest request) { // @Valid and in SignUpRequest no validation
        return authenticationService.signUp(request);
    }

    @PostMapping("/sign-in")
    public JwtAuthenticationResponse signIn(@RequestBody @Valid SignInRequest request) { // Also
        return authenticationService.signIn(request);
    }
}