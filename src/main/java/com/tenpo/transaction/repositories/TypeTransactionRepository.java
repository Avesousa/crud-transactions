package com.tenpo.transaction.repositories;

import com.tenpo.transaction.entities.TypeTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeTransactionRepository extends JpaRepository<TypeTransaction, Integer> {
}
