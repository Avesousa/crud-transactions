package com.tenpo.transaction.services.imp;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tenpo.transaction.dtos.response.TypeTransactionResponse;
import com.tenpo.transaction.repositories.TypeTransactionRepository;
import com.tenpo.transaction.services.TypeTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TypeTransactionServiceImp implements TypeTransactionService {

    @Autowired
    private TypeTransactionRepository repository;

    ObjectMapper mapper = new ObjectMapper();

    @Override
    public List<TypeTransactionResponse> get() {
       return mapper.convertValue(repository.findAll(), new TypeReference<List<TypeTransactionResponse>>() {});
    }

    @Override
    public TypeTransactionResponse getById(Integer id) {
        return mapper.convertValue(repository.getById(id),TypeTransactionResponse.class);
    }
}
