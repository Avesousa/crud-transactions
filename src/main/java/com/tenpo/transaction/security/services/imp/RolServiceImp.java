package com.tenpo.transaction.security.services.imp;

import com.tenpo.transaction.security.entities.Rol;
import com.tenpo.transaction.security.enums.RolName;
import com.tenpo.transaction.security.repositories.RolRepository;
import com.tenpo.transaction.security.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RolServiceImp implements RolService {

    @Autowired
    RolRepository repository;

    @Override
    public Optional<Rol> getRolByRolName(RolName rolName) {
        return repository.findByDescription(rolName);
    }
}
