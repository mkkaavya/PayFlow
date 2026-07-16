package com.payflow.service;

import com.payflow.common.response.ApiResponse;
import com.payflow.dto.HealthResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class HealthService {

    public ApiResponse<HealthResponse> getHealthStatus() {

        HealthResponse response = new HealthResponse(
                "UP",
                "payment-service",
                "1.0.0",
                LocalDateTime.now()
        );

        return new ApiResponse<>(
                true,
                "PayFlow service is running successfully",
                response
        );
    }
}