package com.payflow.service;

import com.payflow.common.response.ApiResponse;
import com.payflow.dto.RegisterRequest;
import com.payflow.dto.RegisterResponse;

public interface AuthService {

    ApiResponse<RegisterResponse> register(RegisterRequest request);

}