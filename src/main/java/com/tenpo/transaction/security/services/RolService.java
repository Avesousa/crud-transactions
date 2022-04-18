package com.tenpo.transaction.security.services;

import com.tenpo.transaction.security.entities.Rol;
import com.tenpo.transaction.security.enums.RolName;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface RolService {
    Optional<Rol> getRolByRolName(RolName rolName);
}
