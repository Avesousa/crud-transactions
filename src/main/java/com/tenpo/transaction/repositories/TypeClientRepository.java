package com.tenpo.transaction.repositories;

import com.tenpo.transaction.entities.TypeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeClientRepository extends JpaRepository<TypeClient,Integer> {
}
