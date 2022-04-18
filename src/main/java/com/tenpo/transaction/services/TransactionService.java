package com.tenpo.transaction.services;

import com.tenpo.transaction.dtos.response.TransactionResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TransactionService {
    List<TransactionResponse> getAll();
    TransactionResponse getById(Integer id);
}
