package com.tenpo.transaction.security.repositories;

import com.tenpo.transaction.security.entities.Rol;
import com.tenpo.transaction.security.enums.RolName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol,Integer> {
    Optional<Rol> findByDescription(RolName description);
}
