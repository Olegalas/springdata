package com.dexter.spring.data.repository.second;

import com.dexter.spring.data.model.second.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<Admin, Long> {
    Admin findByNameAndPass(String name, String pass);
}
