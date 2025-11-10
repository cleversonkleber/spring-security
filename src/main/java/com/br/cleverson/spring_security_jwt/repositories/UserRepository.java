package com.br.cleverson.spring_security_jwt.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.cleverson.spring_security_jwt.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

    Optional<User> findByUsername(String username);

}
