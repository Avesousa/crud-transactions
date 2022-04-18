package com.tenpo.transaction.controllers;

import com.tenpo.transaction.dtos.response.TypeClientResponse;
import com.tenpo.transaction.services.TypeClientService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@ApiResponse(responseCode = "200", description = "Endpoint for get the clients type", content = {
        @Content(mediaType = "application/json")
})
@RestController
@RequestMapping("client-types")
public class TypeClientController {

    @Autowired
    private TypeClientService service;

    @Operation(summary = "Get the clients type")
    @GetMapping()
    public ResponseEntity<List<TypeClientResponse>> getTransactions() {
        return ResponseEntity.ok(service.get());
    }

}
