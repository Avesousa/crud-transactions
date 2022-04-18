package com.tenpo.transaction.services;

import com.tenpo.transaction.dtos.response.TypeTransactionResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TypeTransactionService {
    List<TypeTransactionResponse> get();
    TypeTransactionResponse getById(Integer id);
}
