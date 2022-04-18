package com.tenpo.transaction.controllers;

import com.tenpo.transaction.dtos.response.TransactionResponse;
import com.tenpo.transaction.dtos.response.TypeTransactionResponse;
import com.tenpo.transaction.services.TransactionService;
import com.tenpo.transaction.services.TypeTransactionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ApiResponse(responseCode = "200", description = "Endpoint for get the transactions", content = {
        @Content(mediaType = "application/json")
})
@RestController
@RequestMapping("transaction")
@CrossOrigin(origins = "*")
public class TransactionController {

    @Autowired
    private TypeTransactionService typeTransactionService;

    @Autowired
    private TransactionService transactionService;

    @Operation(summary = "Get the transactions")
    @GetMapping()
    public ResponseEntity<List<TransactionResponse>> getTransactions() {
        return ResponseEntity.ok(transactionService.getAll());
    }

    @Operation(summary = "Get the transactions type")
    @GetMapping("/types")
    public ResponseEntity<List<TypeTransactionResponse>> getTypes() {
        return ResponseEntity.ok(typeTransactionService.get());
    }

    @Operation(summary = "Get the transaction type by id")
    @GetMapping("/types/{id}")
    public ResponseEntity<TypeTransactionResponse> getTypeById(@PathVariable Integer id) {
        return ResponseEntity.ok(typeTransactionService.getById(id));
    }
}
