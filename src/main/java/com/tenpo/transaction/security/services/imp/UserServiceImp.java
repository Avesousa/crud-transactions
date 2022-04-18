package com.tenpo.transaction.security.services.imp;

import com.tenpo.transaction.security.entities.User;
import com.tenpo.transaction.security.repositories.UserRepository;
import com.tenpo.transaction.security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImp implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public Optional<User> getByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public Boolean existsByUsername(String username) {
        return repository.existsByUsername(username);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return repository.existsByEmail(email);
    }

    @Override
    public void save(User user) {
        repository.save(user);
    }
}
