package com.payflow.controller;

import com.payflow.common.response.ApiResponse;
import com.payflow.dto.RegisterRequest;
import com.payflow.dto.RegisterResponse;
import com.payflow.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ApiResponse<RegisterResponse> register(
            @Valid @RequestBody RegisterRequest request) {

        return authService.register(request);
    }
}