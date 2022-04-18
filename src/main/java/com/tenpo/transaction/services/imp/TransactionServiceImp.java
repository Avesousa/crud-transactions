package com.tenpo.transaction.services.imp;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tenpo.transaction.dtos.response.TransactionResponse;
import com.tenpo.transaction.repositories.TransactionRepository;
import com.tenpo.transaction.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TransactionServiceImp implements TransactionService {

    @Autowired
    private TransactionRepository repository;

    ObjectMapper mapper = new ObjectMapper();

    @Override
    public List<TransactionResponse> getAll() {
        return mapper.convertValue(repository.findAll(), new TypeReference<List<TransactionResponse>>() {});
    }

    @Override
    public TransactionResponse getById(Integer id) {
        return mapper.convertValue(repository.getById(id), TransactionResponse.class);
    }
}
