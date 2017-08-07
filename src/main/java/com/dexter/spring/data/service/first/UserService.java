package com.dexter.spring.data.service.first;


import com.dexter.spring.data.model.first.User;
import com.dexter.spring.data.repository.first.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Transactional("firstTransactionManager")
    public User saveUser(String name, String pass){
        User user = new User();
        user.setName(name);
        user.setPass(pass);
        user.setState("NEW");
        repository.save(user);
        return user;
    }

    public User getUser(String name, String pass){
        return repository.findByNameAndPass(name, pass);
    }

}
