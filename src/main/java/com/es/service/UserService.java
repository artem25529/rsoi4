package com.es.service;

import com.es.model.User;
import com.es.repository.UserRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserService {
    @Resource
    private UserRepo userRepo;

    public List<User> getAll() {
        return userRepo.findAll();
    }

    public User getById(Long id) {
        return userRepo.getById(id);
    }

    @Transactional
    public void add(User user) {
        userRepo.save(user);
    }

    @Transactional
    public void delete(User user) {
        userRepo.delete(user);
    }

}
