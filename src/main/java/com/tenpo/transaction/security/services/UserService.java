package com.tenpo.transaction.security.services;

import com.tenpo.transaction.security.entities.User;
import com.tenpo.transaction.security.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public interface UserService {

    Optional<User> getByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    void save(User user);
}
