package com.tenpo.transaction.services;

import com.tenpo.transaction.dtos.response.TypeClientResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TypeClientService {
    List<TypeClientResponse> get();
    TypeClientResponse getById(Integer id);
}
