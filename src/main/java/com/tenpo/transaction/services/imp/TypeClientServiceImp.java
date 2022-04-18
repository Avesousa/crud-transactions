package com.tenpo.transaction.services.imp;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tenpo.transaction.dtos.response.TypeClientResponse;
import com.tenpo.transaction.repositories.TypeClientRepository;
import com.tenpo.transaction.services.TypeClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TypeClientServiceImp implements TypeClientService {

    @Autowired
    private TypeClientRepository repository;

    ObjectMapper mapper = new ObjectMapper();

    @Override
    public List<TypeClientResponse> get() {
        return mapper.convertValue(repository.findAll(), new TypeReference<List<TypeClientResponse>>() {});
    }

    @Override
    public TypeClientResponse getById(Integer id) {
        return mapper.convertValue(repository.getById(id),TypeClientResponse.class);
    }
}
