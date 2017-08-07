package com.dexter.spring.data.service.second;

import com.dexter.spring.data.model.second.Admin;
import com.dexter.spring.data.repository.second.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository repository;

    @Transactional("secondTransactionManager")
    public Admin saveAdmin(String name, String pass){
        Admin admin = new Admin();
        admin.setName(name);
        admin.setPass(pass);
        admin.setState("NEW");
        repository.save(admin);
        return admin;
    }

    public Admin getAdmin(String name, String pass){
        return repository.findByNameAndPass(name, pass);
    }
}
