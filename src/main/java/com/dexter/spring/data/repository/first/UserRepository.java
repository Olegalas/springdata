package com.dexter.spring.data.repository.first;

import com.dexter.spring.data.model.first.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByNameAndPass(String name, String pass);
}
