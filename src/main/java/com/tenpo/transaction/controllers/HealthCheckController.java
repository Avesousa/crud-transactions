package com.tenpo.transaction.controllers;

import com.tenpo.transaction.dtos.response.HealthCheckResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ApiResponse(responseCode = "200", description = "Endpoint for know the state of the api", content = {
        @Content(mediaType = "application/json")
})
@RestController
@RequestMapping("health-check")
public class HealthCheckController {

    @Operation(summary = "Status of api")
    @GetMapping()
    public ResponseEntity<HealthCheckResponse> healthCheck() {
        return ResponseEntity.ok(new HealthCheckResponse("Api is ok"));
    }

}
